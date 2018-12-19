package com.pagelibrary.com.cucumber;

import java.util.HashMap;
import java.util.List;

public class newbranch_m {
	public static void branches_m(List<HashMap<String,String>>map,int index)
	{
		newbranchpage.newbranch.click();
		newbranchpage.branchname.sendKeys(map.get(index).get("BranchName"));
		newbranchpage.address1.sendKeys(map.get(index).get("Address"));
		newbranchpage.area.sendKeys(map.get(index).get("Area"));
		newbranchpage.Zipcode.sendKeys(map.get(index).get("Zipcode"));
		Generic.dropdown_handle(newbranchpage.country).selectByVisibleText(map.get(index).get("country"));
		Generic.dropdown_handle(newbranchpage.city).selectByVisibleText(map.get(index).get("City"));
		Generic.dropdown_handle(newbranchpage.state).selectByVisibleText(map.get(index).get("State"));

	}
	

}
