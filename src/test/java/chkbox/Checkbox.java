package chkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://total-qa.com/checkbox-example/");
		
		driver.manage().window().maximize();
		
	java.util.List<WebElement> Checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and @name='chk']\r\n"
			+ ""));
		System.out.println("Total number of Checkboxes:" + Checkboxes.size());
		
		for(int i=0;i<Checkboxes.size();i++)
			
		{
			Checkboxes.get(i).click();
		}
				
	}

}
