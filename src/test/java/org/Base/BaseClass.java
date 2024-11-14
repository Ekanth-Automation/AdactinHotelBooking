package org.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	

	
	
	public static WebDriver driver;
	// Ch2 WebDriver 6 methods

	public WebDriver launchBrowser() {
		driver = new ChromeDriver();
		return driver;
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void implicitWt(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public String getCurrentUrlbyBase() {
		String url = driver.getCurrentUrl();
		return url;
	}

	public String getTitlebyBase() {
		String title = driver.getTitle();
		return title;
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}

	// Ch 3 WebElement 7 methods
	public void sendKeysByBase(WebElement element, String data) {
		element.sendKeys(data);
	}// sendkeys
	// not working

	public String getTextByBase(WebElement element) {
		String userName = element.getText();
		return userName;

	}

	public void clickbyBase(WebElement element) {
		element.click();
	}

	// Ch 4 Xpath
	public WebElement findElementById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	public WebElement findElementByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	public WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	// Ch 5 Debug
	// Ch 6 Actions
	public Actions actionsByBase() {
		Actions act = new Actions(driver);
		return act;
	}

	// Ch 7 Robot
	public Robot robotByBase() throws AWTException {
		Robot r = new Robot();
		return r;

	}

	// Ch 8 frame
	public void switchTobyBase(WebElement element) {
		driver.switchTo().frame(element);
	}

	// Ch 9 Takes ScreenShot
	public void takesScSt(String fileloc) throws IOException {

		TakesScreenshot tk = (TakesScreenshot) driver;
		File srcFile = tk.getScreenshotAs(OutputType.FILE);
		File loc = new File(fileloc);
		FileUtils.copyFile(srcFile, loc);
	}

	// Ch 10 JavaScript Executor
	// script for sendkeys
	public void jsinsert(String data, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + data + "')", element);
	}

	// script for getAttribute
	public String jsgetAttr(WebElement element) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object userName = js.executeScript("return arguments[0].getAttribute('value')", element);
		String mytext = (String) userName;
		return mytext;
	}

	// Ch 11 DropDown
	public Select selectByBase(WebElement element) {
		Select slt = new Select(element);
		return slt;
	}

	// ch 12 = fluent wait
	public Wait<WebDriver> fluentWaitbyBase(int tsec, int fsec) {
		Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(tsec))
				.pollingEvery(Duration.ofSeconds(fsec)).ignoring(Throwable.class);
		return w;
	}

	// ch 12 Page Load timeout
	public void pageLoadTimeoutByBase() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}

	// 13 = Alert
	public Alert alsertByBase() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

	// ch 14 Windows handling
	public void windowsHandleByBase(String element) {
		driver.switchTo().window(element);

	}

	// ch 14 Windows handling = to get parent window
	public String getWindowHandleByBase() {
		String parent = driver.getWindowHandle();
		return parent;
	}
	// ch 14 Windows handling = to get child window Id

	public Set<String> getWindowHandlesByBase() {
		Set<String> child = driver.getWindowHandles();
		return child;

		// Ch 15 WebTable
		// Ch 16 Navigation Commands
	}
	
	public void headerValidation(WebElement element) {
		
		String headerText = element.getText();
		
		if (element.isDisplayed()) {
			
			System.out.println("Header Valindation Sucessful for: "+headerText);
			
		} else
		{
			System.out.println("Header Valindation is not Sucessful");

		}
		
		}
	public void webTableData(WebElement tableElement) {
		
		List<WebElement> tHeaddingSearch = tableElement.findElements(By.tagName("tr"));
		for (int i = 0; i < tHeaddingSearch.size(); i++) {
			WebElement headdingSearch = tHeaddingSearch.get(i);
		List<WebElement> tdataSearch = headdingSearch.findElements(By.tagName("td"));
			for (int j = 0; j < tdataSearch.size(); j++) {
			WebElement dataSearch = tdataSearch.get(j);
			String allDataSearch = dataSearch.getText();
			System.out.print(allDataSearch);
			
			
		}
		}
		}
	
	public void webdriverwaitByBase(int sec, By locator) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
		WebElement ordreId = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
	

	}

	public void verifyenable() {
		
		
	}


}
