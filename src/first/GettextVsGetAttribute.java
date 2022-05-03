package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextVsGetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/text-box");
		WebElement uname = driver.findElement(By.id("userName"));
		System.out.println("Result from getAttribute() method:" + uname.getAttribute("placeholder"));
		System.out.println("result from gettext() method" + uname.getText());
		System.out.println("result from getAttribute() method " + uname.getAttribute("id"));
		uname.sendKeys("fullname tejaswini");
		System.out.println("result from gA after send value"+ uname.getAttribute("//input[@id='userName']"));
		

	}

}
