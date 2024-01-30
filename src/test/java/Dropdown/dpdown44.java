package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dpdown44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.manage().window().maximize();
		
		WebElement dpday = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]"));
		
		Select dp1box = new Select(dpday);
		
		dp1box.selectByVisibleText("8");
		
		List<WebElement> Options1 = dp1box.getOptions();
		
		System.out.println("total Number of Options:" + Options1.size());
		
		for(int i =0; i<Options1.size(); i++)
			
		{
			System.out.println(Options1.get(i).getText());
		}
		
		WebElement dpmonth = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]"));
		
		Select dp2box = new Select(dpmonth);
		
		dp2box.selectByVisibleText("April");
		
		List<WebElement> Options2 = dp2box.getOptions();
		System.out.println("Total Number of Option:"  + Options2.size());
		
		for(int i=0; i<Options2.size(); i++)
		{
			System.out.println(Options2.get(i).getText());
			
	       }
		
		WebElement dpyear = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]"));
		
		Select dp3box = new Select(dpyear);
		
		dp3box.selectByVisibleText("2020");
		
		List<WebElement> Options3 = dp3box.getOptions();
		System.out.println("Total Number of Options:" + Options3.size());
		
		for(int i =0; i<Options3.size(); i++)
		{
			System.out.println(Options3.get(i).getText());
		}
		

	}

}
