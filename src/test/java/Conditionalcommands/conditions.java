package Conditionalcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://demo.nopcommerce.com/register");
		
	driver.manage().window().maximize();
		
	WebElement logo = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
	
	System.out.println("Logo of the Webpage : " + logo.isDisplayed());
	
	WebElement SearchBox = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
	
	//System.out.println("Search Box of the WebPage : " + SearchBox.isDisplayed());
	
	System.out.println("SearchBox of the WebPage :" + SearchBox.isEnabled());
	
	WebElement male_rd = driver.findElement(By.id("gender-male"));
	
	WebElement Female_rd = driver.findElement(By.id("gender-female"));
	
	System.out.println("After Selection of the male");
	Female_rd.click();
	
	System.out.println(male_rd.isSelected());
	
	System.out.println(Female_rd.isSelected());
	
	
	
	
	
	

	}

}
