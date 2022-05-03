package first;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement dropcountry=driver.findElement(By.id("input-country"));
		Select dropcou = new Select(dropcountry);
		/*dropcou.selectByVisibleText("Bhutan");
		dropcou.selectByValue("24");
		dropcou.selectByIndex(1);*/
//selecting option from dropdown without using method
		List<WebElement>alloptions=dropcou.getOptions();
		for(WebElement option:alloptions)
		{
			if(option.getText().equals("Cuba"))
					{
				      option.click();
				      break;
					}
		}
		
		
	}

}
