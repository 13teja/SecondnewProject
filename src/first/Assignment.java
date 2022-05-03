package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/tool-tips");
		//driver.findElement(By.id("toolTipButton"));
		Actions as= new Actions(driver);
		as.moveToElement(driver.findElement(By.id("toolTipButton"))).build().perform();
	System.out.println( driver.findElement(By.xpath("//*[@id='toolTipButton' and @aria-describedby='buttonToolTip']")).isDisplayed());
		
		//System.out.println(wv.isDisplayed());
		
		
		
		
		
		
		
	}

}
