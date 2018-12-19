package com.pagelibrary.com.cucumber;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import TestBase.Base;

public class Generic  {
	public static Select dropdown_handle(WebElement element) {
		Select s = new Select(element);
		return s;
	}

	public static Alert Alert_handle(WebDriver driver) {

		Alert a = driver.switchTo().alert();
		return a;
	}

	/*public static boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException ex) {
			return false;
		}
	}*/
}
