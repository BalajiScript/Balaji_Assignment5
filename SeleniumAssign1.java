package webdriverCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssign1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String url=driver.getCurrentUrl();
		
		System.out.println("URL "+url);
		
		//Capture the application url and verify url ends with “login”//
		
		String test = url;
		String lastWord = test.substring(test.lastIndexOf("/")+1);
		System.out.println(lastWord);
		
        System.out.println("URL contians login: "+test.contains("login"));
		
		//Capture the application url and verify url contains “demo”//
		
		String test1 = url;
		System.out.println("URL contains demo: "+test1.contains("demo"));
		
		//Capture the application title and verify title contains HRM" //
		
		String title = driver.getTitle();
		System.out.println("Title:  "+title);
        System.out.println("Title contains HRM: " +title.contains("HRM"));


	}

}
