package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ecomm {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://ecommtest.ktctc.co.in/signup.php");
		driver.findElement(By.name("firstname")).sendKeys("KTCTC");
		driver.findElement(By.name("email")).sendKeys("KTCTC");
		driver.findElement(By.name("mobile")).sendKeys("9970107180");
		driver.findElement(By.name("password")).sendKeys("99701071");
		driver.findElement(By.name("repassword")).sendKeys("99701071");
		WebElement tb = driver.findElement(By.name("city"));
		Select st = new Select(tb);
		st.selectByValue("city");
		WebElement s = driver.findElement(By.name("type"));
		Select ts= new Select(s);
		ts.selectByVisibleText("Consumer");
	    driver.findElement(By.name("signup")).click();
		

	}

}
