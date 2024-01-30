package Getpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		driver.manage().window().maximize();
		
		System.out.println("Title of the Web Page:" + driver.getTitle());
		
		System.out.println("Current URL of the WebPage:" + driver.getCurrentUrl());
		
		WebElement Searchbox = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
		
		System.out.println("Searchbox of the WebPage:" + Searchbox.isEnabled());
		
		WebElement male_rdbtn = driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
		
		WebElement female_rdbtn = driver.findElement(By.xpath("//*[@id=\"gender\"]/span[2]/label"));
		
		male_rdbtn.click();
		
		System.out.println("After Selection of the Male Radio Button:" + male_rdbtn.isSelected());
		
		System.out.println("After Selection of the Female Radio Button:" + female_rdbtn.isSelected());
				

	}

}
