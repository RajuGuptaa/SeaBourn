package Script;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import GenericLib.Base;
import GenericLib.WebDriverUtilities;
import POM.HomePage;
import POM.MobilePage;

public class AddToWishList extends Base {
	@Test
	public void TC1() throws InterruptedException {
	HomePage hp=new HomePage(driver);
	WebDriverUtilities wu=new WebDriverUtilities();
	MobilePage mp=new MobilePage(driver);
	Thread.sleep(2000);
	hp.Searchfd();
	hp.search();
	hp.Samsun();
	wu.SwitchTabs(driver);
	mp.wish();
}
}