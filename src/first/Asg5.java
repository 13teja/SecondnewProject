package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asg5 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://demoqa.com/date-picker");
String date = "April 22, 2022 1:19 PM";

WebElement driv = driver.findElement(By.id("dateAndTimePickerInput"));
for(int i=0;i<25;i++)
{
driv.sendKeys(Keys.BACK_SPACE);

}
driv.sendKeys(date);
driv.sendKeys(Keys.ENTER);
}

	

}
