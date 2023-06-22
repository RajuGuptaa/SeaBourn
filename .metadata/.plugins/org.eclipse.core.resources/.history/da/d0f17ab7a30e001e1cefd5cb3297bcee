package GenericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	public Photo pho=new Photo();
	public Property pro=new Property();
	public WebDriverUtilities wdu=new WebDriverUtilities();
	@BeforeMethod
	public void OpenApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(pro.PropertiesFile("url"));
	}
	@AfterMethod
	public void CloseApp(ITestResult res) throws IOException {
		int status=res.getStatus();
		String name=res.getName();
		
		if(status==2) {
			pho.getPhoto(driver, name);
		}
		driver.quit();
	}
}
