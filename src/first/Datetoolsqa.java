package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datetoolsqa {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://demoqa.com/automation-practice-form");
driver.findElement(By.id("dateOfBirthInput")).click();
Select se=new Select(driver.findElement(By.className("react-datepicker__year-select")));
se.selectByVisibleText("1990");
Select sm = new Select(driver.findElement(By.className("react-datepicker__month-select")));
sm.selectByVisibleText("May");
driver.findElement(By.xpath("//*[@class='react-datepicker__month-select'] //*[@class='react-datepicker__day react-datepicker__day--012']")).click();

	}

}
