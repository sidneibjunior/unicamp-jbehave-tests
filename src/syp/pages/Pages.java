package syp.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import syp.webdriver.SeleniumHelper;
import syp.webdriver.SeleniumProvider;

public class Pages {
	private WebDriver driver;
	private SeleniumHelper helper;

	public Pages() {
		this.driver = SeleniumProvider.getDriver();
		this.helper = new SeleniumHelper();
	}

	public Home homePage() {
		return new Home();
	}

	public Login loginPage() {
		return new Login();
	}

	public Lists listsPage() {
		return new Lists();
	}
	
	public CreateUser createUserPage() {
		return new CreateUser();
	}
	
	public boolean isMessageVisible(String message) {
//		$x("//text() = 'Screen Name is required, minimum 6 characters.'")
		
		//text()[. = 'Password is required, minimum 6 characters']
		return helper.findElement(By.xpath("//text()['" + message + "']")) != null;
	}

}
