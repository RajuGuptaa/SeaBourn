

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLib.Base;
import POM.LoginPage;

public class TC1 extends Base{
	@Test
	public void TC() throws IOException, InterruptedException {
	LoginPage lp=new LoginPage(driver);
	Thread.sleep(2000);
	lp.loginbtn();
	Thread.sleep(2000);
	lp.username(pro.PropertiesFile("user"));
	Thread.sleep(2000);
	lp.pass(pro.PropertiesFile("password"));
	Thread.sleep(2000);
	lp.check();
	Thread.sleep(2000);
	lp.log();
}
}