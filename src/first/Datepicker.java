package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

SelectMethod(driver,"2013","May","23");
/*driver.get("https://demoqa.com/date-picker");
driver.findElement(By.id("datePickerMonthYearInput")).click();
Select se=new Select(driver.findElement(By.className("react-datepicker__year-select")));
se.selectByVisibleText("1900");
Select sm = new Select(driver.findElement(By.className("react-datepicker__month-select")));
sm.selectByVisibleText("January");
driver.findElement(By.xpath("//*[@class='react-datepicker__week'] //*[@class='react-datepicker__day react-datepicker__day--012']")).click();*/
	}
public static void SelectMethod(WebDriver driver, String yyyy, String mm,String dd)
{
	driver.get("https://demoqa.com/date-picker");
	driver.findElement(By.id("datePickerMonthYearInput")).click();
	Select se=new Select(driver.findElement(By.className("react-datepicker__year-select")));
	se.selectByVisibleText(yyyy);
	Select sm = new Select(driver.findElement(By.className("react-datepicker__month-select")));
	sm.selectByVisibleText(mm);
	driver.findElement(By.xpath("//*[@class='react-datepicker__week'] //*[@class='react-datepicker__day react-datepicker__day--0"+dd+"']")).click();
}
}
