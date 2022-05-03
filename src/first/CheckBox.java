package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver Dr = new ChromeDriver();
		Dr.get("https://demos.dojotoolkit.org/dijit/tests/form/test_CheckBox.html");
	
		WebElement tr =Dr.findElement(By.xpath("//*[@id='cb0']"));
            System.out.println(tr.isDisplayed());
            System.out.println(tr.isEnabled());
            System.out.println(tr.isSelected());	
            }

}
