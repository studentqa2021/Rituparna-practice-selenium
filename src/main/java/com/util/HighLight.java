package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighLight {
	public static void getColour(WebDriver driver,WebElement element) {
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'",element );
	}

}
