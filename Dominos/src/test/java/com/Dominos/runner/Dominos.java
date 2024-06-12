package com.Dominos.runner;

import java.time.Duration;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Dominos {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.dominos.co.in");
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//*[@id=\"online-banner\"]/div/a/button")).click();
		/*
		 * //Thread.sleep(30);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
		 String mainwindow = driver.getWindowHandle(); Set<String> childwindows =
		 * driver.getWindowHandles(); for(String handle:childwindows) {
		 * if(!handle.equals(mainwindow)) { driver.switchTo().window(handle);
		 * 
		 * }
		 * 
		 * }
		 * 
		 * driver.switchTo().window(mainwindow);
		 */
		// driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"optInText\"]")).click();
		driver.findElement(By.xpath("//*[@placeholder='Enter your delivery address']"))
				.click();

		// WebElement Enterarea =

		driver.findElement(By.xpath(
				"//input[@placeholder='Enter Area / Locality']"))
				.sendKeys("600100");
		// driver.findElement(By.xpath("//*[@id=\"desktopBannerWrapped\"]/div/div[3]/div[1]/button[1]")).click();
		// Enterarea.sendKeys("600100");
		// Enterarea.click();
		driver.findElement(By.xpath("(//div[@class='lst-wrpr'])[1]")).click();
		ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-getnotifications"); 
			//veg pizza
		driver.findElement(By.xpath("//span[normalize-space()='VEG PIZZA']")).click();
		//add margherita pizza
		driver.findElement(By.xpath("//div[@data-label='Veg Pizza']//div[@data-label='Margherita']//span[contains(text(),'ADD TO CART')]")).click();
		// no Thanks
		driver.findElement(By.xpath("//button[@data-label='Add button']//span[contains(text(),'NO THANKS')]")).click();
		// add one more 
		//driver.findElement(By.xpath("//div[@data-label='Veg Pizza']//div[@data-label='Margherita']//div[@data-label='quantity']//div[@data-label='increase']")).click();
		Thread.sleep(3000);
		String Quantity="2";
		driver.findElement(By.xpath("//div[@data-label='Veg Pizza']//div[@data-label='Margherita']//div[@data-label='quantity']//span[contains(text(),'"+Quantity+"')]")).click();
		//WebElement margherita_value = driver.findElement(By.xpath("//*[@id=\\\"mn-lft\\\"]/div[6]/div/div[2]/div/div/div[1]/div/div[3]/span"));
		//String elementval = margherita_value.getAttribute("value");
		Thread.sleep(300);
		WebElement margherita_value = driver.findElement(By.xpath("//div[@data-label='Veg Pizza']//div[@data-label='Margherita']//span[@class='rupee']"));

		//System.out.println(e.getText());
		 String actualElementText = margherita_value.getText();

		//using getText method the retrieve the text of the element

		String expectedElementText = "239";

		 //Assert to verify the actual and expected values

		//Assert.assertEquals(actualElementText, expectedElementText,"Expected and Actual values are same");
		Assert.assertEquals("Expected and Actual values are same", expectedElementText, actualElementText);
		
		//driver.findElement(By.xpath("//*[@id=\"mn-lft\"]/div[6]/div/div[2]/div/div/div[1]/div/div[3]/span"));

 
		//System.out.println("Expected and Actual values are same");
		
		driver.findElement(By.xpath("//div[@data-label='Veg Pizza']//div[@data-label='Peppy Paneer']//span[contains(text(),'ADD TO CART')]")).click();
		driver.findElement(By.xpath("//div[@data-label='Veg Pizza']//div[@data-label='Peppy Paneer']//div[@data-label='quantity']//div[@data-label='increase']")).click();
		
		/*
		 * WebElement peppypanner_value = driver.findElement(By.xpath(
		 * "//*[@id=\"mn-lft\"]/div[6]/div/div[2]/div/div/div[1]/div/div[3]/span"));
		 * 
		 * 
		 * //System.out.println(e.getText()); String actualpeppypannerElementText =
		 * peppypanner_value.getText();
		 * 
		 * //using getText method the retrieve the text of the element
		 * 
		 * String expectedpeppypannerElementText = "459";
		 * 
		 * //Assert to verify the actual and expected values
		 * 
		 * 
		 * Assert.assertEquals("Expected and Actual values are same",
		 * expectedpeppypannerElementText, actualpeppypannerElementText);
		 */
		driver.findElement(By.xpath("//div[@data-label='Veg Pizza']//div[@data-label='Primavera Gourmet-Pizza']//span[contains(text(),'ADD TO CART')]")).click();
	
		//WebElement scroll = driver.findElement(By.className("menu-right"));
		//scroll.sendKeys(Keys.PAGE_DOWN);
		//driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div[2]/div[2]/div[2]/div[2]/div/div/div[1]")).click();
		driver.findElement(By.xpath("//div[@data-label='Veg Pizza']//div[@data-label='Primavera Gourmet-Pizza']//div[@data-label='quantity']//div[@data-label='increase']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='BEVERAGES']")).click();
		driver.findElement(By.xpath("//div[@data-label='Pepsi 475ml']//span[contains(text(),'ADD TO CART')]")).click();
		
		String pepsiQuantity = "12";
		driver.findElement(By.xpath("//div[@data-label='Pepsi 475ml']//div[@data-label='quantity']/span[contains(text(),'"+pepsiQuantity+"')]")).click();
		for(int i=0; i<12; i++) {
			driver.findElement(By.xpath("//div[@data-label='Pepsi 475ml']//div[@data-label='increase']")).click();
		}
		driver.findElement(By.xpath("//button[@data-label='miniCartCheckout']")).click();
	
		Thread.sleep(3000);
		//driver.getClass();
		//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		//w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//div[@data-label='cart-item-entry']//span[contains(text(),'Pepsi 475ml')]/following-sibling::div/div/div[@data-label='quantity']//div[@data-label='decrease']")));
		driver.findElement(By.xpath("//div[@data-label='cart-item-entry']//span[contains(text(),'Margherita')]/following-sibling::div/div/div[@data-label='quantity']//div[@data-label='decrease']")).click(); 
		for(int j=0; j<6;j++) {
			Thread.sleep(3000);

			driver.findElement(By.xpath("//div[@data-label='cart-item-entry']//span[contains(text(),'Pepsi 475ml')]/following-sibling::div/div/div[@data-label='quantity']//div[@data-label='decrease']")).click();
		}
	}
		
	
}
