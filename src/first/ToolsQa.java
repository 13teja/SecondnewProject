package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQa {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver Driver = new ChromeDriver();
		Driver.get("https://demoqa.com/text-box");
		ChromeDriver tab= new ChromeDriver();
		tab.get("https://www.facebook.com/");
		
		Driver.navigate().back();
		Driver.navigate().forward();
		Driver.navigate().refresh();
	
		
		
		
		
		 WebElement ca= Driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		
ca.sendKeys("mangalwedha");






	}

}
