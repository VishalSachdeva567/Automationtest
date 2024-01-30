package Handlealert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup33 {

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
		
		String act_Text = driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
		
		String exp_Text = ("You entered: Welcome");
		
		System.out.println(act_Text);
		
		
		if(act_Text.equals(exp_Text))
			
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}

	}

}
