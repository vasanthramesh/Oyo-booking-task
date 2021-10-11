package org.Oyo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
	public static WebDriver driver;
/*
 * This method is for storing the WebElements
 */
	public Base() {
		PageFactory.initElements(driver, this);
	}
}
