package first;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://demo.guru99.com/test/newtours/register.php");
     WebElement web =driver.findElement(By.name("country"));
      Select dropdown = new Select(web);
      dropdown.selectByVisibleText("SAO TOME AND PRINCIPE");
      
     /* List<WebElement>alloptions=dropdown.getOptions();
      for(WebElement option:alloptions)
      {
    	  option.getText();
    	  System.out.println(option);
      }
      */
      
	}

}
