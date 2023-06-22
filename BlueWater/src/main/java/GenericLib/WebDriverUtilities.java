package GenericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
public void dropDown(WebElement ele,String text) {
	Select s=new Select(ele);
	s.selectByVisibleText(text);
}
public void click(WebElement ele){
	ele.click();
}
public void rightClick(WebElement ele,WebDriver driver) {
	Actions a=new Actions(driver);
	a.contextClick().perform();;
}
public void DoubleClick(WebElement ele,WebDriver driver) {
	Actions a=new Actions(driver);
	a.doubleClick().perform();;
}
public void DragDrop(WebElement ele,WebDriver driver,WebElement src,WebElement dest) {
	Actions a=new Actions(driver);
	a.dragAndDrop(src, dest);
}
public void SwitchFrame(WebDriver driver) {
	driver.switchTo().frame(0);
}
public void AlertPopUp(WebDriver driver) {
	driver.switchTo().alert().accept();
}
public void SwitchTabs(WebDriver driver) {
	Set<String> child = driver.getWindowHandles();
	for(String b:child) {
		driver.switchTo().window(b);
	}
}
public void ScrollBar(WebDriver driver,int x,int y) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeAsyncScript("window.scrollBy("+x+","+y+")");
}
}
