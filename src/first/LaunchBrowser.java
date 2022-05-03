package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getPageSource());
		
		
		
	}

}
