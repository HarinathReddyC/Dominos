package com.Dominos.utils;

import java.io.FileNotFoundException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {

	private static HelperClass helperClass;
	private static WebDriverWait wait;
	private static WebDriver driver;
	public final static int Timeout = 1000;
	private static ConfigFileReader getVal;

	private HelperClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(Timeout));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Timeout));

		driver.manage().window().maximize();

	}

	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();

	public WebDriver init_driver(String browser) {
		System.out.println("browser value is:" + browser);
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		} else if (browser.equals("safari")) {
			WebDriverManager.safaridriver().setup();
			tlDriver.set(new SafariDriver());
		} else {
			System.out.println("please pass the correct browser value: " + browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
		
	}

	public static void openUrl() throws FileNotFoundException {

		getVal = new ConfigFileReader();

		driver.get(getVal.getApplicationUrl());
	}

	public static WebDriver getDriver() {
		return driver;

	}

	public static void setUpDriver() {

		if (helperClass == null) {
			helperClass = new HelperClass();
		}

	}

	public static void actionClick(WebElement element) {

		Actions ac = new Actions(driver);
		ac.moveToElement(element).click().perform();
	}

	public static void waitUntilElementVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitUntilclickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void tearDown() {

		if (driver != null) {
			driver.close();
			driver.quit();

		} else {
			driver.quit();
		}

		helperClass = null;
	}

}
