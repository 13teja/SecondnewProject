package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("/html/body/main/ul/li[1]/a")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
	
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("/html/body/main/div/section[1]/ul/li[14]/a/span")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//div[@class='topNav']//a[contains(text(),'Help')]")).click();
        
	}

}
