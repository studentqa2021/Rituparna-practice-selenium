package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.BaseConfig;
import com.util.HighLight;

public class BaseLoginPractice {
	public void getLogin() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(BaseConfig.getValue("URL"));
		driver.manage().window().maximize();
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		HighLight.getColour(driver,mpf.getUser() );
		mpf.getUser().sendKeys(BaseConfig.getValue("USER"));
		HighLight.getColour(driver,mpf.getPassword() );
		mpf.getPassword().sendKeys(BaseConfig.getValue("PASS"));
		mpf.getLoginButton().click();
		driver.quit();
		
	}

}
