package GenericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	public Photo p=new Photo();
	public Property pro=new Property();
	@BeforeMethod
	public void OpenApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(pro.PropertyFile("url"));
	}
	public void CloseApp(ITestResult res) {
		int status=res.getStatus();
		String name=res.getName();
		if(status==2) {
			p.getPhoto(driver, name);
			driver.quit();
		}
		
	}
}
