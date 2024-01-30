package crlogi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practice.expandtesting.com/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("practice");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!");
		
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
		
		String act_Title = driver.getTitle();
		String exp_Title = "Test Automation Practice: Working with Secure Page";
		
		if(act_Title.equals(exp_Title))
		{
			System.out.println("Test Passed");
			
		}
		else
		{
			System.out.println("Test failed");
		}

	}

}
