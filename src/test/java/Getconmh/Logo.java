package Getconmh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().window().maximize();
		
		WebElememnt logo = driver.find
		System.out.println("Logo of the WebElement:" + logo.isdisplayed());
		
		
		
		
		

	}

}
