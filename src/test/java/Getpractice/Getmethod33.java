package Getpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vscrm.in/");
		
		driver.manage().window().maximize();
		
		System.out.println("Title of the Page:" + driver.getTitle());
		
		System.out.println("Current URL of the Page:" + driver.getCurrentUrl());
		
		driver.quit();
 
	}

}
