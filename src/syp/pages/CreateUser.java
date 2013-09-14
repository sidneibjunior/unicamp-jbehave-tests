package syp.pages;

import syp.webdriver.SeleniumHelper;

public class CreateUser {

	private SeleniumHelper helper;
	

	public CreateUser() {
		helper = new SeleniumHelper();
	}

	public void openCreateUserPage() {
		helper.openUrl("http://54.221.210.14/predict/pub/register/RegisterAction.show");
	}
	
	
	

}
