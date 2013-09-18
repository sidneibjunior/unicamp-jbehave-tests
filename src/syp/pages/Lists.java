package syp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import syp.webdriver.SeleniumHelper;

public class Lists {
	private SeleniumHelper helper;

	private By fieldTitle = By.xpath("//input[@name='Title']");
	private By buttonAdd = By
			.xpath("//input[@type='submit' and @value='Add/    Edit']");
	private By pageTitle = By.xpath("//h2");
	private By logoutButton = By.xpath("//input[@value='Log Out']");
	
	private By errorTitleMessage = By.xpath("//span[text()='Oops! Please provider a title (up to 50 characters)']");
	private String tableList = "//table[@class='report' and @title='Prediction Lists']";
	

	public Lists() {
		helper = new SeleniumHelper();
	}
	
	public void logout() {
		helper.findElement(logoutButton).click();
	}
	

	public void addTitle(String title) {
		type(helper.findElement(fieldTitle), title);
		click(helper.findElement(buttonAdd));

	}
	
	public void editTitle(String title) {
		type(helper.findElement(fieldTitle), title);
		click(helper.findElement(buttonAdd));

	}	

	public String getTableInfoByPosition(int line, int column) {
		return helper.findElement(
				By.xpath(tableList + "//tr[" + (line + 1) + "]/td[" + column
						+ "]")).getText();
	}

	public String getScreenName() {
		return helper.findElement(pageTitle).getText();
	}

	public String getLogoutButton() {
		return helper.findElement(logoutButton).getAttribute("value");
	}

	public void click(WebElement element) {
		element.click();
	}

	public void type(WebElement element, String string) {
		element.sendKeys(string);
	}


}
