package syp;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import syp.pages.Pages;
import syp.webdriver.SeleniumHelper;

public class MySteps {
	public Pages pages;
	public SeleniumHelper helper;

	public MySteps() {
		this.pages = new Pages();
	}

	@Given("I am on Share your predictions home page")
	public void openHomePage() {
		pages.homePage().openHomePage();
	}
	
	@Given("I am on Create User Page")
	public void openCreateUserPage() {
		pages.createUserPage().openCreateUserPage();
	}

	@Given("I login as $user with password $passwd")
	public void login(String user, String passwd) {
		pages.loginPage().login(user, passwd);
	}
	
	@Given("the database is ready") 
	public void prepareDatabase() {
		// TODO implementar método. Ler arquivo de properties, conectar ao banco, 
		// limpar as tabelas, cadastrar usuário com email: usuarioemail@email.com
	}
	
	@When("I login as $user with password $passwd")
	public void loginAs(String user, String passwd) {
		pages.loginPage().login(user, passwd);
	}

	@When("I add the list of prediction $listName")
	public void addList(String listName) {
		pages.listsPage().addTitle(listName);
	}
	
	@When("I click the \"Link\" button of the list of prediction $listName")
	public void editList(String listName) {
		pages.listsPage().editTitle(listName);
	}
	
	@Then("I click on logout button")
	public void userLogout() {
		pages.listsPage().logout();
	}
	
	@Then("I am logged in as $user")
	public void userIsLoggedIn(String user) {
		Assert.assertEquals(user, pages.loginPage().getLoggedinUserName());
	}

	@Then("I must see the button $name")
	public void buttonName(String name) {
		Assert.assertEquals(name, pages.listsPage().getLogoutButton());
	}
	
	@Then("I must see the message $name")
	public void labelText(String name) {
		
		Assert.assertTrue(pages.listsPage().getLoginErrorMessage() != null);
//		Assert.assertTrue(pages.isMessageVisible(name));
	}
	
	@Then("I must see the error $name")
	public void errorText(String name) {
		Assert.assertEquals(name, pages.listsPage().getLoginErrorMessage());
	}
	

	@Then("Your Lists screen must be opened with name $name")
	public void yourListsScreen(String name) {
		Assert.assertEquals(name, pages.listsPage().getScreenName());
	}

	@Then("The list must have the value $value at line $lineNumber and column $columnNumber")
	public void yourListsInfo(String value, int lineNumber, int columnNumber) {
		Assert.assertEquals(
				value,
				pages.listsPage().getTableInfoByPosition(lineNumber,
						columnNumber));
	}
	

}
