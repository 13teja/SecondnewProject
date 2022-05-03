package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations {

	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
 WebDriver driver= new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
WebElement button= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
 Actions act= new Actions(driver);
 act.contextClick(button).build().perform();
 
 

	}

}
