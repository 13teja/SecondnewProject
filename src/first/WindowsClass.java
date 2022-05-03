package first;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsClass {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("https://demoqa.com/browser-windows");
	 String wb = driver.getWindowHandle();
	 driver.findElement(By.id("tabButton")).click();
	 Set<String> st = driver.getWindowHandles();
	 for(String each:st)
	 {
	    if(!each.equals(wb))
	    {
	    driver.switchTo().window(each);
	    }
	 }
		
		
		
		
		
		
		
		
		
	}

}
