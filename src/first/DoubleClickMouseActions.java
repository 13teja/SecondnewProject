package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMouseActions {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		 driver.switchTo().frame("iframeResult");
		 WebElement dc =driver.findElement(By.xpath("//button[contains(text(),'Double-click me')]"));
          Actions act = new Actions(driver);
          act.doubleClick(dc).perform();
	}

}
