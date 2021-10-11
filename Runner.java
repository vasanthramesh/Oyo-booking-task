package org.Oyo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Runner extends CommonFunctions {
	@BeforeSuite
	private void browserlaunch() {
		configBrowser(browser);
		launchUrl("https://www.oyorooms.com/");
	}

	@Test
	private void roomBooking() throws InterruptedException {
		PageObject p = new PageObject();
		System.out.println("<-------Room booking was started sucessfully-------->");
		enterText(p.location, "wayanad,kerla", "location");
		click(p.select, "location");
		click(p.datepicker, "datepicker");
		click(p.chekindate, "checkindate");
		click(p.checkoutdate, "checkoutdate");
		click(p.roomselection, "roomcount");
		click(p.addroom, "addroom");
		click(p.addguests, "add guest");
		click(p.roomsearch, "search");
		System.out.println("<-------Room search was Done successfully------->");
		click(p.sortrating, "sort by rating");
		click(p.guestoption, "guest option");
		scroll();
		click(p.bookroom, "book room");
		hotelNames();
		System.out.println("<--------Rooms name and price displayed------->");
		System.out.println("<--------Room booking done successfully------->");

	}

	@AfterSuite
	private void tearDown() {
		driver.quit();
	}
}
