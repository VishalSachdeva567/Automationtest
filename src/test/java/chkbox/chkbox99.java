package chkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chkbox99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://total-qa.com/checkbox-example/");
		
		driver.manage().window().maximize();
		
		List<WebElement> Checkboxes = driver.findElements(By.xpath("//input[@type = 'checkbox' and @name = 'chk']"));
		
		System.out.println("Total Number of Checkboxes:" + Checkboxes.size());
		
		for(int i=3; i<Checkboxes.size(); i++)
		{
			Checkboxes.get(i).click();
		}

	}

}
