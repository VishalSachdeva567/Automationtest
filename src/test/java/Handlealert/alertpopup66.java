package Handlealert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		Alert alertwindow = driver.switchTo().alert();
		
		alertwindow.sendKeys("Welcome");
		
		alertwindow.accept();
		
		//Validation
		
		WebElement act_text = driver.findElement(By.id("demo1"));
		String actualText = act_text.getText();
		String expectedText = "Hello Welcome How are you today";

		System.out.println(actualText);
		System.out.println(expectedText);

		if(actualText.equals(expectedText)) {
		    System.out.println("Test Passed");
		} else {
		    System.out.println("Test Failed");
		}
		

	}

}
