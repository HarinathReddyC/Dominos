package com.Dominos.definitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Dominos.utils.HelperClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class DominosTest {

	
	@Before
	public static void setUp() {
		HelperClass.setUpDriver();
	}
	
	
	@After
	public  void tearDown(Scenario scenario) {
		if(scenario.isFailed()){
			//final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			//scenario.attach(screenshot,"image/png", scenario.getName());
			
		final byte[] screenshot= ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot,"image/png", scenario.getName());
		
		}
		else {
			final byte[] screenshot = ((TakesScreenshot) HelperClass.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot,"image/png", scenario.getName());
			
			
		}
		HelperClass.tearDown();
	}
}
