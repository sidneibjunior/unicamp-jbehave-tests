package syp.pages;

import org.openqa.selenium.By;

import syp.utils.Util;
import syp.webdriver.SeleniumHelper;

public class CreateUser {
	

	private By loginNameField = By.xpath("//input[@name='LoginName']");
	private By screeNameField = By.xpath("//input[@name='ScreenName']");
	private By emailField = By.xpath("//input[@name='Email']");
	private By passwordField = By.xpath("//input[@name='Password']");
	private By confirm_passwordField = By.xpath("//input[@name='PasswordConfirm']");
//	private By captcha = By.xpath("//input[@name='j_password']");
	
	private By registerButton = By.xpath("//input[@value='Register']");

	private SeleniumHelper helper;
	private String SERVER_ADDRESS;

	public CreateUser() {
		helper = new SeleniumHelper();
		SERVER_ADDRESS = Util.readProperty("server.address", "http://54.221.210.14");
	}

	public void openCreateUserPage() {
		helper.openUrl(SERVER_ADDRESS + "/predict/pub/register/RegisterAction.show");
	}

	public void fillForm(String login, String screen, String email,	String passwd, String confirm_passwd, String captcha) {
		helper.findElement(loginNameField).sendKeys(login);
		helper.findElement(screeNameField).sendKeys(screen);
		helper.findElement(emailField).sendKeys(email);
		helper.findElement(passwordField).sendKeys(passwd);
		helper.findElement(confirm_passwordField).sendKeys(confirm_passwd);
		
	}

	public void clickRegisterButton() {
		helper.findElement(registerButton).click();		
	}

}
