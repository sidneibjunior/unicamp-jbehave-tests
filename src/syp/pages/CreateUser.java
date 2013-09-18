package syp.pages;

import org.openqa.selenium.By;

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

	public CreateUser() {
		helper = new SeleniumHelper();
	}

	public void openCreateUserPage() {
		//helper.openUrl("http://54.221.210.14/predict/pub/register/RegisterAction.show");
		helper.openUrl("http://192.168.0.10:8080/predict/pub/register/RegisterAction.show");
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
