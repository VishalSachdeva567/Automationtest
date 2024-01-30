package Locatorstest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shoppingsheettask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://variablesoft.com/");
		driver.manage().window().maximize();
	  List<WebElement> Sliders = driver.findElements(By.className("slides"));
	 System.out.println("Total Number of Sliders:" + Sliders.size());
	
	List<WebElement>  Images = driver.findElements(By.tagName("img"));
	System.out.println("Total number of images:" + Images.size());

	}

}
