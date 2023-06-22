package generic;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
	public Property p=new Property();
	public WebDriverUtilities wu=new WebDriverUtilities();
	@BeforeMethod
public void OpenApp() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(p.getdata("url"));
	}
	public void CloseApp(ITestResult res) throws IOException {
		int status=res.getStatus();
		String name=res.getName();
		if(status==2) {
			Photo p=new Photo();
			p.getPhoto(driver, name);
		}
		driver.quit();
	}
}
