package syp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import syp.webdriver.SeleniumHelper;

public class Home {

	private SeleniumHelper helper;
	

	public Home() {
		helper = new SeleniumHelper();
	}

	public void openHomePage() {
		helper.openUrl("http://54.221.210.14/predict/");
	}
	
	
	

}
