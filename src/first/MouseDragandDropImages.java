package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragandDropImages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		WebElement dr=driver.findElement(By.xpath("//li[1]"));
		WebElement sr=driver.findElement(By.xpath("//li[2]"));
		WebElement tr=driver.findElement(By.xpath("//li[3]"));
		WebElement ar=driver.findElement(By.xpath("//li[4]"));
		WebElement trash= driver.findElement(By.id("trash"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dr,trash).perform();
		act.dragAndDrop(sr,trash).perform();
		act.dragAndDrop(tr,trash).perform();
		act.dragAndDrop(ar,trash).perform();
		

	}

}
