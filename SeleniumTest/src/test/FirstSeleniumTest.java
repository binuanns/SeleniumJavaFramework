package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.Googlesearchpage;
/**
 * 
 * @author Binooos
 *
 */
public class FirstSeleniumTest {
	WebDriver driver=null;
	@Test
	public void check() {
		String projectlocation=System.getProperty("user.dir");
		//System.setProperty("webdriver.chrome.driver", "D://Appium//chromedriver//chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver",projectlocation+ "\\lib\\chromedriver\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.findElement(By.xpath("//input[@type='text'][@name='q']")).sendKeys("Automation");
		
		Googlesearchpage.textbox_search(driver).sendKeys("Sepby steps");
		Googlesearchpage.button_search(driver).sendKeys(Keys.RETURN);
		
		//List<WebElement> elementslist=driver.findElements(By.xpath("//input"));
		//int count=elementslist.size();
		//System.out.println("size is"+count);
		
	}

}
