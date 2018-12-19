package com.pagelibrary.com.cucumber;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage {
	@FindBy(name="txtuId")
	public static WebElement username;
	@FindBy(name="txtPword")
	public static WebElement password;
	@FindBy(id="login")
	public static WebElement login;
}
