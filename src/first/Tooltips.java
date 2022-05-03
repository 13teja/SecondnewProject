package first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltips {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(0);
		WebElement inputbox = driver.findElement(By.id("age"));
		String tooltip =inputbox.getAttribute("title");
		String tooltipstext=inputbox.getText();
System.out.println(tooltip);
System.out.println(tooltipstext);
	}

}
