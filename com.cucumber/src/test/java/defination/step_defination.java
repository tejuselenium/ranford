package defination;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pagelibrary.com.cucumber.Branches;
import com.pagelibrary.com.cucumber.loginpage;
import com.pagelibrary.com.cucumber.newbranch_m;
import com.pagelibrary.com.cucumber.newbranchpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import datahelper.Helper;
import modules.branches_m;
import modules.login_mod;

public class step_defination {
	
    WebDriver driver;

    List<HashMap<String, String>> map;
	public step_defination(){
		this.driver=Hooks.driver;
		map=Helper.exceldata("‪.\\Excel\\exceldata.xlsx", "Sheet1");
	}
	@Given("^launch the site$")
	public void launch_the_site() throws Throwable {
		driver.get("http://srssprojects.in/home.aspx");
	   
	}

	@When("^enter the username with \"([^\"]*)\" and enter the password with \"([^\"]*)\" and click login button$")
	public void enter_the_username_with_and_enter_the_password_with_and_click_login_button(String user, String pass) throws Throwable {
		PageFactory.initElements(driver,loginpage.class);
		login_mod.login_m(user,pass);
	    
	}

	@Then("^branches button should be displayed$")
	public void branches_button_should_be_displayed() throws Throwable {
		PageFactory.initElements(driver, Branches.class);
		branches_m.branch_exe();	
	   
	}

	@Then("^close the site$")
	public void close_the_site() throws Throwable {
	   driver.close();
	}

	@When("^Enter the \"([^\"]*)\" data from excel$")
	public void Enter_the_data_from_excel(String row) throws Throwable {
		PageFactory.initElements(driver, newbranchpage.class);
	   int index=Integer.parseInt(row);
	   newbranch_m.branches_m(map, index);
	   
	}

}
