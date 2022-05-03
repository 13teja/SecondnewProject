package first;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	



	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver chDriver = new ChromeDriver();
		
		chDriver.get("https://ecommtest.ktctc.co.in/login.php");
		
		chDriver.findElement(By.name("email")).sendKeys("9970107180");
		chDriver.findElement(By.name("password")).sendKeys("9970107180");
		chDriver.findElement(By.name("login")).click();
		
		ChromeDriver ch = new ChromeDriver();
		ch.get("https://www.facebook.com/index.php");
		
		By em = By.id("email");
		 WebElement emailid = ch.findElement(em);
		 emailid.sendKeys("KTCTC");
		 
		 By pass =By.name("pass");
		 WebElement password =ch.findElement(pass);
		 password.sendKeys("34251267");
		  
		 By lg = By.name("login");
		 WebElement login=ch.findElement(lg);
		 login.click();
		 
		 ChromeDriver vh= new ChromeDriver();
		 By eml =By.id("email");
		 

	}

}
