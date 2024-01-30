package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dpdown33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		driver.manage().window().maximize();
		
		WebElement dpday = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]"));
		
		Select dp1box = new Select(dpday);
		
		dp1box.selectByVisibleText("10");
		
		List<WebElement> options = dp1box.getOptions();
		
		System.out.println("Total N. of options:" + options.size());
		
		for(int i =0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		WebElement dpmonth = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]"));
		
		Select dp2box = new Select(dpmonth);
		
		dp2box.selectByVisibleText("June");
		
		List<WebElement> options1 = dp2box.getOptions();
		
		System.out.println("Total Number of Options:" + options1.size());
		
		for(int i =0; i<options1.size(); i++)
		{
			System.out.println(options1.get(i).getText());
		}
		
		WebElement dpyear = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]"));
		
		Select dp3box = new Select(dpyear);
		
		dp3box.selectByVisibleText("1925");
		
		List<WebElement> Options2 = dp3box.getOptions();
		System.out.println("Total Number of Options:" + Options2.size());
		
		for(int i=0; i<Options2.size(); i++)
			
		{
			System.out.println(Options2.get(i).getText());
		}

	}

}
