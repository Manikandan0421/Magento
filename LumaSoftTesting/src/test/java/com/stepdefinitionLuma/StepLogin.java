package com.stepdefinitionLuma;
import com.base.BaseClass;
import com.pojo.LoginPojo;

import io.cucumber.java.en.*;

public class StepLogin extends BaseClass  {
	LoginPojo l;
	@Given("I am on the Magento registration page")
	public void i_am_on_the_magento_registration_page() {
		launchBrowser();
		loadUrl("https://magento.softwaretestingboard.com/");
		maximizeWindow();
	}

	@When("I enter valid registration details")
	public void i_enter_valid_registration_details() {
		l=new LoginPojo();
		btnClick(l.getCreateAcc());
		type(l.getTxtFirst(),"Mani");
		type(l.getTxtLast(),"C");
		type(l.getTxtEmail(),"manikandanchetty0421@gmail.com");
		type(l.getTxtPass(),"Mani@123");
		type(l.getTxtConfirmPass(),"Mani@123");
		
	}

	@When("I submit the registration form")
	public void i_submit_the_registration_form() {
		l=new LoginPojo();
		btnClick(l.getTxtCreateAcc());  
	}

	@Then("I should see a confirmation message")
	public void i_should_see_a_confirmation_message() {
	    System.out.println("Successfully account created...");
	}

	@Given("I am on the Magento login page")
	public void i_am_on_the_magento_login_page() {
		launchBrowser();
		loadUrl("https://magento.softwaretestingboard.com/");
		maximizeWindow();
	}

	@When("I enter valid login credentials")
	public void i_enter_valid_login_credentials() {
		l=new LoginPojo();
		btnClick(l.getSignIn()); 
		type(l.getUserName(),"manikandanchetty0421@gmail.com");
		type(l.getPassWord(),"Mani@123");
	}

	@When("I submit the login form")
	public void i_submit_the_login_form() {
	
		btnClick(l.getLogIn()); 
		
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
	   System.out.println("logged in successfully.....");
	}
	
	
	
}
