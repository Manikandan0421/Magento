package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver,this);
			}
	@FindBy(xpath="(//a[text()='Create an Account'])[1]")
	private WebElement createAcc;
	
	@FindBy(id="firstname")
	private WebElement txtFirst;
	
	@FindBy(id="lastname")
	private WebElement txtLast;
	
	@FindBy(id="email_address")
	private WebElement txtEmail;
		
	@FindBy(id="password") 
	private WebElement txtPass;
	
	@FindBy(id="password-confirmation")
	private WebElement txtConfirmPass;
	
	@FindBy(xpath="//button[@title='Create an Account']//span[1]")
	private WebElement txtCreateAcc;
	
	@FindBy(xpath="(//li[@class='authorization-link']//a)[1]")
	private WebElement signIn;
	
	@FindBy(xpath="//input[@title='Email']") 
	private WebElement userName;
	
	@FindBy(xpath="//input[@title='Password']")
	private WebElement passWord;
	
	@FindBy(xpath="(//button[@type='submit']//span)[2]")
	private WebElement logIn;

	public WebElement getCreateAcc() {
		return createAcc;
	}

	public WebElement getTxtFirst() {
		return txtFirst;
	}

	public WebElement getTxtLast() {
		return txtLast;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getTxtConfirmPass() {
		return txtConfirmPass;
	}

	public WebElement getTxtCreateAcc() {
		return txtCreateAcc;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogIn() {
		return logIn;
	}
	

	
}
