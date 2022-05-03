package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverAction {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement DB=driver.findElement(By.xpath("//a[contains(text(),'Desktops')]"));
		WebElement mac= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(DB).moveToElement(mac).click().perform();
		

	}

}
