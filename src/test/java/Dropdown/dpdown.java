package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dpdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.manage().window().maximize();
		
		WebElement drp = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select drpbox = new Select(drp);
		
		drpbox.selectByVisibleText("Antarctica");

		
		
		 List<WebElement> options = drpbox.getOptions();
        System.out.println("Total Options: " + options.size());
        
        for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		

	}

}
