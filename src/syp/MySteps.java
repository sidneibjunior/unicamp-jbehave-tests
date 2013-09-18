package syp;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import syp.dao.impl.CheckDaoImpl;
import syp.dao.impl.User;
import syp.pages.Pages;
import syp.webdriver.SeleniumHelper;

public class MySteps {
	public SeleniumHelper helper;
	public Pages pages;

	public MySteps() {
		
	}

	@Given("I am on Share your predictions home page")
	public void openHomePage() {
		getPages().homePage().openHomePage();
	}
	
	@Given("I am on Create User Page")
	public void openCreateUserPage() {
		getPages().createUserPage().openCreateUserPage();
	}

	@Given("I login as $user with password $passwd")
	public void login(String user, String passwd) {
		getPages().loginPage().login(user, passwd);
	}
	
	@Given("the database is ready") 
	public void prepareDatabase() {
		// TODO implementar método. Ler arquivo de properties, conectar ao banco, 
		// limpar as tabelas, cadastrar usuário com email: usuarioemail@email.com
		User user = new User();
		CheckDaoImpl checkDAOcondition = new CheckDaoImpl();
		user = checkDAOcondition.consultaUser("teste01");
		System.out.println(user.getEmail());
	}
	
	@When("I login as $user with password $passwd")
	public void loginAs(String user, String passwd) {
		getPages().loginPage().login(user, passwd);
	}
	
	@When("I add Login Name $login, Screen Name $screen, Email $email, Password $passwd, Confirm Password $confirm_passwd, Captcha $captcha")
	public void fillCreateUserFields(String login, String screen, String email, String passwd, String confirm_passwd, String captcha) {
		getPages().createUserPage().fillForm(login, screen, email, passwd, confirm_passwd, captcha);
	}
	
	@When("I click on Register button")
	public void clickRegisterButton() {
		getPages().createUserPage().clickRegisterButton();
	}

	@When("I add the list of prediction $listName")
	public void addList(String listName) {
		getPages().listsPage().addTitle(listName);
	}
	
	@When("I click the \"Link\" button of the list of prediction $listName")
	public void editList(String listName) {
		getPages().listsPage().editTitle(listName);
	}
	
	@Then("I click on logout button")
	public void userLogout() {
		getPages().listsPage().logout();
	}
	
	@Then("I am logged in as $user")
	public void userIsLoggedIn(String user) {
		Assert.assertEquals(user, getPages().loginPage().getLoggedinUserName());
	}

	@Then("I must see the button $name")
	public void buttonName(String name) {
		Assert.assertEquals(name, getPages().listsPage().getLogoutButton());
	}
	
	@Then("I must see the message $message")
	public void assertSpanMessageIsVisible(String message) {
		Assert.assertTrue(getPages().isMessageVisible(message));
	}
	
	@Then("I must see the login error message $name")
	public void errorText(String name) {
		Assert.assertTrue(getPages().loginPage().getLoginErrorMessage() != null);
	}
	
	@Then("the user $name is inserted on the database")
	public void assertUserIsOnTheDatabase(String name) {
		
	}
	

	@Then("Your Lists screen must be opened with name $name")
	public void yourListsScreen(String name) {
		Assert.assertEquals(name, getPages().listsPage().getScreenName());
	}

	@Then("The list must have the value $value at line $lineNumber and column $columnNumber")
	public void yourListsInfo(String value, int lineNumber, int columnNumber) {
		Assert.assertEquals(
				value,
				getPages().listsPage().getTableInfoByPosition(lineNumber,
						columnNumber));
	}

	public Pages getPages() {
		if (pages == null) {
			pages = new Pages();
		}
		return pages;
	}

	public void setPages(Pages pages) {
		this.pages = pages;
	}
	

}
