package org.testRunner;

import org.Base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\AdactinHotelBooking.feature", 
dryRun=false, glue="org.stepDefs", monochrome=true, plugin= {"pretty",
		"junit:target\\Adactin.xml","html:target", "json:target\\Adactin.json"})
public class TestRunnerClass {
	@AfterClass
	public static void afterClass() {
		
		JVMReport.generateJVMReport("C:\\Users\\ekant\\Desktop\\Ekanth\\AdactinHotelBooking\\target\\Adactin.json");

	}

}
 