package first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MutiplekeyPresses {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://text-compare.com");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement wb =driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement tb=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		wb.sendKeys("Welcome to selenium");
	act.keyDown(Keys.CONTROL);
	act.sendKeys("a");
	act.keyUp(Keys.CONTROL).perform();
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("c");
	act.keyUp(Keys.CONTROL);
	act.perform();
	
	act.sendKeys(Keys.TAB).perform();
	
	act.keyDown(Keys.CONTROL);
	act.sendKeys("v");
	act.keyUp(Keys.CONTROL).perform();
	
	
	if(wb.getAttribute("value").equals(tb.getAttribute("value")))
	{
		System.out.println("the text is copied");
		
	}
	else
		System.out.println("the text is not copied");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

	}

}
