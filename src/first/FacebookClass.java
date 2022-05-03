package first;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("KTCTC");;
driver.findElement(By.id("pass")).sendKeys("tejaswini");
driver.findElement(By.name("login")).click();
driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
driver.findElement(By.name("firstname")).sendKeys("KTCTC");;
driver.findElement(By.name("lastname")).sendKeys("KT");
driver.findElement(By.name("reg_email__")).sendKeys("ktcttc");
driver.findElement(By.name("reg_passwd__")).sendKeys("ktctc");
driver.findElement(By.xpath("//input[@value='1' and @type='radio']")).click();



	}

}
