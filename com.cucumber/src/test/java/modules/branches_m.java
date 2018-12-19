package modules;

import com.pagelibrary.com.cucumber.Branches;

public class branches_m {
	public static void branch_exe(){
		if (Branches.branches.isDisplayed()){
			System.out.println("branches btn is displayed");
			Branches.branches.click();
		}
	}

}
