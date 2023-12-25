package com.trello.qspiders.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This class contains capabilities of Selenium WebDriver Interface.
 * 
 * @author Basavaraj Pujar
 *
 */
public class WebDriverUtility {
	/**
	 * @author Sagar Implicit wait in terms Of Seconds as time unit.
	 * @author param driver
	 */
	public static void implicitWaitInSeconds(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	/**
	 * implicit wait in terms Of milliSeconds as time unit.
	 * 
	 * @param driver
	 */
	public void implicitWaitMillis(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	}

	/**
	 * wait until Verify and validate the complete title of the WebPage.
	 * 
	 * @author Abhi
	 * @param driver
	 * @param expectedTitle
	 * @return validate in boolean
	 */
	public boolean verifyCompleteTitle(WebDriver driver, String expectedTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		boolean validation = wait.until(ExpectedConditions.titleIs(expectedTitle));
		return validation;
	}

	/**
	 * wait until Verify and validate the complete URL of the WebPage
	 * 
	 * @author Santosh
	 * @param driver
	 * @param expectedURL
	 * @return validation in boolean
	 */
	public boolean verifyCompleteUrl(WebDriver driver, String expectedUrl) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		boolean validation = wait.until(ExpectedConditions.urlToBe(expectedUrl));
		return validation;
	}

	/**
	 * To transfer the driver control to the new window in the same session
	 * 
	 * @author Akash
	 * @param driver
	 * @param windowId
	 * @return WebDriver
	 */
	public WebDriver controlTransferToWindow(WebDriver driver, String windowId) {
		WebDriver updatedDriver = driver.switchTo().window(windowId);
		return updatedDriver;
	}

	public WebElement elementToBeClickable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(element));
		return ele;
	}

	public boolean partialTitle(WebDriver driver, String partialTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		boolean validation = wait.until(ExpectedConditions.titleContains(partialTitle));
		return validation;
	}

}
