package syp.pages;


import org.openqa.selenium.WebDriver;

import syp.webdriver.SeleniumProvider;

public class Pages {
	private WebDriver driver;

	public Pages() {
		this.driver = SeleniumProvider.getDriver();
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

}
