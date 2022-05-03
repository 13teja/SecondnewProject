package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileSendKeys {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
	   driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
       driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Administrator\\Desktop\\sample.pdf");
	}

}
