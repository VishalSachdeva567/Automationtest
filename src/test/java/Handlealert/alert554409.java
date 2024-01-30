package Handlealert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert554409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"promtButton\"]")).click();
		
		Alert alertwindow = driver.switchTo().alert();
		
		alertwindow.sendKeys("Test");
		
		alertwindow.accept();
		
		String act_Text = driver.findElement(By.xpath("//*[@id=\"promptResult\"]")).getText();
		String exp_Text = "You entered Test";
		
		System.out.println(act_Text);
		System.out.println(exp_Text);
		
		if(act_Text.equals(exp_Text))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		

	}

}
