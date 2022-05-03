package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Regestration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();;
		driver.findElement(By.name("firstname")).sendKeys("KTCTC");;
		driver.findElement(By.name("lastname")).sendKeys("KT");
		driver.findElement(By.name("reg_email__")).sendKeys("ktcttc");
		driver.findElement(By.name("reg_passwd__")).sendKeys("ktctc");
		WebElement wb1=driver.findElement(By.id("day"));
		Select s1 = new Select(wb1);
		s1.selectByVisibleText("10");
		
		WebElement wb2=driver.findElement(By.id("month"));
		Select s2 = new Select(wb2);
		//s2.selectByVisibleText("feb");
		s2.selectByIndex(1);
	
		WebElement wb3=driver.findElement(By.id("year"));
		Select s3 = new Select(wb3);
		//s3.selectByVisibleText("1998");
		s3.selectByValue("1998");
		
		driver.findElement(By.xpath("//input[@value='1' and @type='radio']")).click();


	}

}
