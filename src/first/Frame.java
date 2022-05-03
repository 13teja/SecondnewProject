package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/nestedframes");
		driver.switchTo().frame("frame1");
		System.out.println("Switched to parent frame");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@srcdoc='<p>Child Iframe</p>']")));
		System.out.println("Switched to child frame");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]"))).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Browser Windows')]")).click();

	}

}
