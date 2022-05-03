package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class CHECKbOX1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		ChromeDriver D = new ChromeDriver();
		D.get("https://ecommtest.ktctc.co.in/login.php");
		WebElement t = D.findElement(By.xpath("/html/body/div[1]/div/form/input"));
		System.out.println(t.isDisplayed());
		System.out.println(t.isEnabled());
		System.out.println(t.isSelected());
		t.click();
		System.out.println(t.isSelected());
		
		
		
		
	}

}
