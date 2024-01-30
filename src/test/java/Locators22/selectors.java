package Locators22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://demo.nopcommerce.com/");
	  
	 // driver.findElement(By.id("small-searchterms")).sendKeys("Macbook");
	  
	 // driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
	  
	 // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Macbook");
	 // driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
	  
	 // driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Macbook");
	 // driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
	  
	  driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Macbook");
	  driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
	  
	  driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  ;

	}

}
