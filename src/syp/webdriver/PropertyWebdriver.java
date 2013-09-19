package syp.webdriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import syp.utils.Util;

public class PropertyWebdriver {
	public enum browserType {
		FIREFOX, IE, CHROME
	}

	public static WebDriver getDriver() {
		browserType browser = browserType.valueOf(Util.readProperty("browser", "FIREFOX"));
		switch (browser) {
		case CHROME:
			// Please define here the path for your Chrome driver
			System.setProperty("webdriver.chrome.driver", "c:/temp/chromedriver.exe");
			return new ChromeDriver();
		case FIREFOX:
			return new FirefoxDriver();
		case IE:
			return new InternetExplorerDriver();
		default:
			break;
		}
		return null;
	}
}
