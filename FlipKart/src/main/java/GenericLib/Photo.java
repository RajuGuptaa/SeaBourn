package GenericLib;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo {
	public void getPhoto(WebDriver driver,String name) {
		Date d=new Date();
		String current=d.toString().replace(":", "_");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(AutoConstant.PhotoPath+name+current+".png");
	}
}
