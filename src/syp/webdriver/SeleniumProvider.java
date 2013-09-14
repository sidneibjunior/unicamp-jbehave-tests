package syp.webdriver;

import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeStory;
import org.openqa.selenium.WebDriver;

public class SeleniumProvider {

	private static WebDriver driver;

	@BeforeStory
	public void createBrowser() {
		driver = new MyDriver(PropertyWebdriver.getDriver());
	}

	@AfterStory
	public void closeBrowser() {
		driver.close();
	}

	public static WebDriver getDriver() {
		return driver;
	}

}
