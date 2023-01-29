package webdriverCommands;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssign1Task4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		Boolean Display=driver.findElement(By.xpath("//*[contains(@href,'linkedin')]")).isDisplayed();
		
		Boolean Display1=driver.findElement(By.xpath("//*[contains(@href,'facebook')]")).isDisplayed();
		
		Boolean Display2=driver.findElement(By.xpath("//*[contains(@href,'twitter')]")).isDisplayed();
		
		Boolean Display3=driver.findElement(By.xpath("//*[contains(@href,'youtube')]")).isDisplayed();
		
		HashMap<String,String> hMap=new HashMap<String,String>();
	    hMap.put("Facebook","https://www.facebook.com/OrangeHRM/");
	    hMap.put("Twitter","https://twitter.com/orangehrm?lang=en");
	    hMap.put("Youtube","https://www.youtube.com/c/OrangeHRMInc");
	    hMap.put("Linkedin","https://www.linkedin.com/company/orangehrm/mycompany/");

     System.out.println(hMap);
	}

}
