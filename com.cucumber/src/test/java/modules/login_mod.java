package modules;

import com.pagelibrary.com.cucumber.loginpage;

public class login_mod {

		public static void login_m(String u,String p)
		{
			loginpage.username.sendKeys(u);
			loginpage.password.sendKeys(p);
			loginpage.login.click();
			
		}
	}


