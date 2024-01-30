package crlogi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		String act_Title = driver.getTitle();
		String exp_Title = "Logged In Successfully | Practice Test Automation";
		
		if(act_Title.equals(exp_Title))
		
		{
			System.out.println("Test Passed");
			
		}
		else
		{
			System.out.println("Test Failed");
		}
			
		
	}

}
