package first;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerttoolsqa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		Alert alt=  driver.switchTo().alert();
		alt.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		WebDriverWait wt= new WebDriverWait(driver, 7);
		Alert alt1= wt.until(ExpectedConditions.alertIsPresent());
		alt1 =driver.switchTo().alert();
		alt1.accept();
		Actions act = new Actions(driver);
		
		WebElement input =driver.findElement(By.id("promtButton"));
		act.moveToElement(input).build().perform();
		input.click();
	
		Alert al= driver.switchTo().alert();
	
		al.sendKeys("Teju");
		
		al.accept();
		
		
		
	}

}
