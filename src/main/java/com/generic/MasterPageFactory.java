package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	
	public MasterPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

   @FindBy(xpath = "//*[@class='input_error form_input']")
	private WebElement user;
   
   @FindBy(xpath = "//*[@name='password']")
  	private WebElement password;
   
   @FindBy(xpath = "//*[@type='submit']")
 	private WebElement loginButton;

public WebElement getUser() {
	return user;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLoginButton() {
	return loginButton;
}
 	
  
   
	
	
	
	
	

}
