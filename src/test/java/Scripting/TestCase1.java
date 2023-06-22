package Scripting;


import org.testng.annotations.Test;

import POM.LoginPage;
import generic.Base;

public class TestCase1 extends Base {
	@Test
	public void tc1() {
		LoginPage lp=new LoginPage(driver);
		
	}
}
