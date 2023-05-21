package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUtility {
	public static WebDriver driver;

	public static void getChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void getEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	public static void getFirefox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	public static void LaunchUrl(String url) {
		driver.get(url);
	}

	public static String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String getCurrentUrl(String string) {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	public static void selectOptionsbyIndex(WebElement element, int n) {
		new Select(element).selectByIndex(n);
	}

	public static void selectOptionsbyText(WebElement element, String text) {
		new Select(element).selectByVisibleText(text);
	}

	public static void selectOptionsbyValue(WebElement element, String attribute) {
		new Select(element).selectByValue(attribute);
	}

	public static void ActionClick(WebElement element) {
		new Actions(driver).click(element).perform();
	}

	public static void ContextClick(WebElement element) {
		new Actions(driver).contextClick(element).perform();
	}

	public static void DoubleClick(WebElement element) {
		new Actions(driver).doubleClick(element).perform();
	}

	public static void DragAndDrop(WebElement src, WebElement dest) {
		new Actions(driver).dragAndDrop(src, dest).perform();
	}

	public static void ClickAndHold(WebElement element) {
		new Actions(driver).clickAndHold(element).perform();
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

	public static void implicitwait(int t) {
		driver.manage().timeouts().implicitlyWait(t, TimeUnit.SECONDS);
	}

	public static void Click(WebElement element) {
		element.click();
	}

	public static void Type(WebElement element, String string) {
		element.sendKeys(string);
	}

	public static void Close() {
		driver.close();
	}

	public static void Quit() {
		driver.quit();
	}

}
