package webdriverCommands;

import java.util.HashMap;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssign1Task5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);
 
		Boolean Display = driver.findElement(By.xpath("//*[contains(@href,'linkedin')]")).isDisplayed();
		Boolean Display1 = driver.findElement(By.xpath("//*[contains(@href,'facebook')]")).isDisplayed();
		Boolean Display2 = driver.findElement(By.xpath("//*[contains(@href,'twitter')]")).isDisplayed();
		Boolean Display3 = driver.findElement(By.xpath("//*[contains(@href,'youtube')]")).isDisplayed();

		String[] url = { "https://www.linkedin.com/company/orangehrm/mycompany", "https://www.facebook.com/OrangeHRM/",
				"https://twitter.com/orangehrm?lang=en", "https://www.youtube.com/c/OrangeHRMInc" };

		for (int i = 0; i < url.length; i++) {
			if (url[i].equals("https://www.youtube.com/c/OrangeHRMInc"))
				;
			break;
		}
		
		System.out.println(url);

	}
}