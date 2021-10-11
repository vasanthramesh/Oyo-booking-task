package org.Oyo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunctions extends Base {
	public static String browser = System.getenv("browser1");
/*
 * This method is for  Browser configuration 
 */
	public static void configBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			System.err.println("please enter correct browser");
		}
		driver.manage().window().maximize();
	}
	
	
	/*
	 * This method is for URl launch
	 */
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	
	/*
	 * This method for Sending the values to the Web element
	 */
	public static void enterText(WebElement element, String data, String log) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(element));
		try {
			element.sendKeys(data);
			System.out.println(log + "  entered  sucessfully ");
		} catch (Exception e) {
			System.err.println(log + "value does not entered ");
			throw new Error();
		}
	}
/*
 * This method for Clicking the Web element
 */
	public static void click(WebElement element, String log) {
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(element));

		try {
			element.click();
			System.out.println(log + " was clicked  successfully ");
		} catch (Exception e) {

			System.err.println(log + " wasn't clicked");

			throw new Error();

		}
	}
/*
 * This method is for print the hotel names and price details
 */
	public static void hotelNames() {
		List<WebElement> list = driver
				.findElements(By.xpath("//h3[@class='listingHotelDescription__hotelName d-textEllipsis']"));
		List<WebElement> list1 = driver.findElements(By.xpath("//span[@class='listingPrice__finalPrice']"));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());

			for (int j = 0; j < list1.size(); j++) {
				System.out.println(list1.get(j).getText());
				break;
			}
			System.out.println("  ");
		}

	}
/*
 * This method is for Scroll the WebPage
 */
	protected void scroll() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 1450);");
	}

	}


