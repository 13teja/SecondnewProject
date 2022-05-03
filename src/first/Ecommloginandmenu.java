package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ecommloginandmenu {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver chDriver = new ChromeDriver();
		chDriver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		chDriver.get("https://ecommtest.ktctc.co.in/login.php");
		
		chDriver.findElement(By.name("email")).sendKeys("9970107180");
		chDriver.findElement(By.name("password")).sendKeys("9970107180");
		chDriver.findElement(By.name("login")).click();
		chDriver.findElement(By.xpath("//*[@id='sidebarCollapse']/span")).click();
		chDriver.findElement(By.xpath("//a[contains(text(),'Home')]/i")).click();
		//WebElement ts =chDriver.findElement(By.xpath("//a[contains(text(),'Butter')]"));
       Actions ac =new Actions(chDriver);
       ac.moveToElement(chDriver.findElement(By.xpath("//a[contains(text(),'Butter')]"))).click();
		//ts.findElement(By.xpath("/html/body/section[3]/div[2]/div/div[1]/div/div[2]/a")).click();

	}

}
