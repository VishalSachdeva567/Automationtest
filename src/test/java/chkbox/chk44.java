package chkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chk44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://total-qa.com/checkbox-example/");

		driver.manage().window().maximize();
		
	

	@SuppressWarnings("unchecked")
	List<WebElement> Checkboxes = (List<WebElement>) driver.findElement(By.xpath("//input[@type = 'checkbox' and @name = 'chk']"));
	
	System.out.println("Total Number of Checkboxes:" + Checkboxes.size());
	
	for(int i=0; i<Checkboxes.size(); i++);
	{
		Checkboxes.get(i).click();
	}
		
	}

}
