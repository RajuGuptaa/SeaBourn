package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="name")
	private WebElement loginbtn;
	
	@FindBy(id="password")
	private WebElement passbtn;
	
	@FindBy(id="last")
	private WebElement pressbtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void btn() {
		pressbtn.click();
	}
	public void user(String usernme) {
		loginbtn.sendKeys(usernme);
	}
	public void pass(String pass) {
		passbtn.sendKeys(pass);
	}
}
