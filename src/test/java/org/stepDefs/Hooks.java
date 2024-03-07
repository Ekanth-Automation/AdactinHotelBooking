package org.stepDefs;

import org.Base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void beforeScenario() {

		launchBrowser(); 
		launchUrl("https://adactinhotelapp.com/index.php");
		maximizeWindow();
		implicitWt(1000);
	}
	@After
	public void afterScenario(Scenario s) {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		byte[] b = ts.getScreenshotAs(OutputType.BYTES);
		s.embed(b, "Adactin.png");
		quitBrowser();
	}
}
