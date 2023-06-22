package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="loginClick")
	private WebElement logintab;

		@FindBy(id="email")
		private WebElement email;
		
		@FindBy(id="password")
		private WebElement password;
		
		@FindBy(id="keepLoggedInCheckBox")
		private WebElement checkbox;
		
		@FindBy(xpath="//button[text()='Login']")
		private WebElement logbtn;
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void loginbtn() {
			logintab.click();
		}
		public void username(String u) {
			email.sendKeys(u);;
		}
		public void pass(String p) {
			password.sendKeys(p);;
		}
		public void check() {
			checkbox.click();
		}
		public void log() {
			logbtn.sendKeys(Keys.ENTER);
		}
}
