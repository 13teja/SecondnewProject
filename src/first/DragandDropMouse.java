package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropMouse {

	public static void main(String[] args) {
		// pavan video
System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
driver.manage().window().maximize();
WebElement rome =driver.findElement(By.id("box6"));
WebElement korea=driver.findElement(By.id("box105"));
Actions act = new Actions(driver);
//act.dragAndDrop(rome, korea).perform();	
act.clickAndHold(rome).moveToElement(korea).release().perform();
	
	
	
	}

}
