package crlogi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("//*[@id=\"signInBtn\"]")).click();
		
		try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		String act_Title = driver.getTitle();
		String exp_Title = "ProtoCommerce";
		
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