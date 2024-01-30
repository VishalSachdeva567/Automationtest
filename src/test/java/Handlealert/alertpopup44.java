package Handlealert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		
		Alert alertwindow = driver.switchTo().alert();
		
		alertwindow.sendKeys("Welcome");
		
		alertwindow.accept();
		
		//Validation
		
		String act_text = driver.findElement(By.id("result")).getText();
		
		String exp_text = ("You entered: Welcome");
		
		System.out.println(act_text);
		
		System.out.println(exp_text);
		
		if(act_text.equals(exp_text))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		

	}

}
