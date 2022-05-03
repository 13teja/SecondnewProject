package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/accordian");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("section1Heading"))).click().build().perform();
		//WebDriverWait wt = new WebDriverWait(driver, 10);
		
		act.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Where does it come from?')]"))).doubleClick().build().perform();
        
	}

}
