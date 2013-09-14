package syp.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import syp.webdriver.condition.ElementIsFound;
import syp.webdriver.condition.Timer;

public class SeleniumHelper {

	private WebDriver driver;

	public SeleniumHelper() {
		this.setDriver(SeleniumProvider.getDriver());
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public WebElement findElement(By element) {
		new Timer(20000).waitUntil(new ElementIsFound(element));
		return driver.findElement(element);
	}

	public String getTitle() {
		return driver.getTitle();
	}

}
