package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();

        driver.get("https://vscrm.in/Account/Login");

        driver.manage().window().maximize();

        driver.findElement(By.name("Email")).sendKeys("abhisingh67@yopmail.com");

        driver.findElement(By.name("Password")).sendKeys("Vsoft@123");

        driver.findElement(By.xpath("//*[@id=\"LoginForm\"]/div[3]/button")).click(); // Fix here

        String act_Title = driver.getTitle();
        String exp_Title = "Variable Soft - Dashboard";

        if (act_Title.equals(exp_Title)) { // Fix here
            System.out.println("Test passed");
        } else {
            System.out.println("Failed");
        }

        // Close the browser
        driver.quit();
    }
}
