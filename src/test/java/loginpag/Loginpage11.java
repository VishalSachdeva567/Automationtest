package loginpag;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://vscrm.in/Account/Login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("abhisingh67@yopmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Vsoft@123");
		driver.findElement(By.xpath("//*[@id=\"LoginForm\"]/div[3]/button")).click();
		
		String act_Title = driver.getTitle();
		String exp_Title = ("Variable Soft - Dashboard");
		
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
