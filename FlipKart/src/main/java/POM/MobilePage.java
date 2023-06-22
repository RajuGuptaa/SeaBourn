package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobilePage {
	@FindBy(xpath="//div[@class='_2hVSre _25_uYi']")
	private WebElement wishlist;
	
	public MobilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void wish() {
			wishlist.click();
		
	}
}
