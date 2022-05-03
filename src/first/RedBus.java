package first;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.redbus.in/");
WebElement st = driver.findElement(By.id("onward_cal"));
st.click();
/*Date date = new Date();
SimpleDateFormat formatee = new SimpleDateFormat("dd-mm-yyyy");
String dat = formatee.format(date);
System.out.println(dat);*/
for(int i =0; i<11; i++)
{
	st.sendKeys(Keys.BACK_SPACE);	
}
st.sendKeys("26-Apr-2022");
st.sendKeys(Keys.ENTER);
}
	}


