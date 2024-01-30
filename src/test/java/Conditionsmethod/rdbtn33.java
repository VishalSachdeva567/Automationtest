package Conditionsmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rdbtn33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

		WebElement logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		
		System.out.println("logo of the WebPage:"  + logo.isDisplayed());
		
		WebElement Searchbox = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		
		System.out.println("Searchbox of the WebPage:"  + Searchbox.isEnabled());
		
		WebElement male_rdbtn = driver.findElement(By.id("gender-male"));
		
		WebElement female_rdbtn = driver.findElement(By.id("gender-female"));
		
		male_rdbtn.click();
		
		System.out.println("After Selection of the Male radio Button:" + male_rdbtn.isSelected());
		
		System.out.println("After Selection of the Female Radio Button:" + female_rdbtn.isSelected());
		
	}

}
