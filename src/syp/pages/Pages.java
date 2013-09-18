package syp.pages;


import org.openqa.selenium.By;

import syp.webdriver.SeleniumHelper;

public class Pages {
	private SeleniumHelper helper;

	public Pages() {
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
//		private By loginErrorMessage = By.xpath("//b[text()='Please try again.']");
		//text()[. = 'Password is required, minimum 6 characters']
		return helper.findElement(By.xpath("//span[text()='" + message + "']")) != null;
	}

}
