package syp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import syp.utils.Util;
import syp.webdriver.SeleniumHelper;

public class Home {

	private SeleniumHelper helper;
	private String SERVER_ADDRESS;
	
	public Home() {
		helper = new SeleniumHelper();
		SERVER_ADDRESS = Util.readProperty("server.address", "http://54.221.210.14");
	}

	public void openHomePage() {
		helper.openUrl(SERVER_ADDRESS+"/predict/");
	}
	
	
	

}
