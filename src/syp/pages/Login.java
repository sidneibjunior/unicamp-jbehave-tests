package syp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import syp.webdriver.SeleniumHelper;

public class Login {
	private SeleniumHelper helper;

	private By userName = By.xpath("//input[@name='j_username']");
	private By password = By.xpath("//input[@name='j_password']");
	private By loginLink = By.xpath("//a[text()='Login']");
	
	private By submit = By.xpath("//input[@value='Login']");

	public Login() {
		helper = new SeleniumHelper();
	}

	public void login(String user, String passwd) {
		helper.findElement(loginLink).click();
		type(helper.findElement(userName), user);
		type(helper.findElement(password), passwd);
		click(helper.findElement(submit));

	}

	public String getLoggedinUserName() {
		return helper.findElement(By.className("profile-link")).getText();
	}

	public static void click(WebElement element) {
		element.click();
	}

	public void type(WebElement element, String string) {
		element.sendKeys(string);
	}

}
