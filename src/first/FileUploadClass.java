package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadClass {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/upload/");
		driver.findElement(By.xpath("//input[@class='upload_txt']")).sendKeys(System.setProperty("‪C:\\Users\\Administrator\\Desktop\\sample.pdf"));
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("submitbutton")).click();

	}

}
