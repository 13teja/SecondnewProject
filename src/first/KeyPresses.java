package first;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPresses {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
        //driver.findElement(By.id("target")).sendKeys(Keys.ENTER);
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_RIGHT).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.SPACE).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(3000);
		act.sendKeys( Keys.DECIMAL).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ADD).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.DOWN).perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.NUMPAD0).perform();
		Thread.sleep(3000);
	}

}
