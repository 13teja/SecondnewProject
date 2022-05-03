package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver dd = new ChromeDriver();
		dd.get("https://ecommtest.ktctc.co.in/signup.php");
		WebElement tr = dd.findElement(By.name("type"));
	
		Select a=new Select(tr);
		a.selectByIndex(0);
		a.selectByValue("3");
		a.selectByVisibleText("Delivery Agent");
	}

}
