package webdriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssign1Task3 {

	public static void main(String[] args) throws InterruptedException {
		
//	Open below application and verify that footer has 4 social media icons
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Thread.sleep(5000);
	
	Boolean Display=driver.findElement(By.xpath("//*[contains(@href,'linkedin')]")).isDisplayed();
	
	Boolean Display1=driver.findElement(By.xpath("//*[contains(@href,'facebook')]")).isDisplayed();
	
	Boolean Display2=driver.findElement(By.xpath("//*[contains(@href,'twitter')]")).isDisplayed();
	
	Boolean Display3=driver.findElement(By.xpath("//*[contains(@href,'youtube')]")).isDisplayed();

	
	System.out.println("Linkedin Footer : "+ Display);
	System.out.println("Facebook Footer : "+ Display1);
	System.out.println("Twitter Footer : "+ Display2);
	System.out.println("Youtube Footer : "+ Display3);
	}
}