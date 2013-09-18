package syp.dao.impl;

import java.sql.Date;
import java.util.Calendar;

public class User {
	private int id;
	private String loginName;
	private String screenName;
	private String password;
	private String email;
	private String formSourceId;
	private String passwordNonce;
	private Date PasswordNonceCreatedOn;
	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFormSourceId() {
		return formSourceId;
	}
	public void setFormSourceId(String formSourceId) {
		this.formSourceId = formSourceId;
	}
	public String getPasswordNonce() {
		return passwordNonce;
	}
	public void setPasswordNonce(String passwordNonce) {
		this.passwordNonce = passwordNonce;
	}
	public Date getPasswordNonceCreatedOn() {
		return PasswordNonceCreatedOn;
	}
	public void setPasswordNonceCreatedOn(Date passwordNonceCreatedOn) {
		PasswordNonceCreatedOn = passwordNonceCreatedOn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
