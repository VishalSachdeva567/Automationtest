package Shoppingsheetlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppingsheetlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.shoppingsheet.com/Account/Logon");
	driver.manage().window().maximize();
	driver.findElement(By.name("UserName")).sendKeys("automationtset4453@yopmail.com");
	driver.findElement(By.name("Password")).sendKeys("Vsoft@1234");
	
	driver.findElement(By.xpath("//*[@id=\"LoginForm\"]/button[2]")).click();
	
	String act_Title = driver.getTitle();
	String exp_Title = ("Compliant Solutions for Estimating College Costs with ShoppingSheet.com");
			
	if(act_Title.equals(exp_Title))		
	{
		System.out.println("Test passed");
	}
	
	else
	{
		System.out.println("Test failed");
	}
	
	
	
	
	

	}

}
