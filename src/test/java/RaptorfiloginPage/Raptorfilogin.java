package RaptorfiloginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Raptorfilogin {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.shoppingsheet.com/Account/Logon");

        Thread.sleep(11000); // Add semicolon here

        driver.findElement(By.name("Email")).sendKeys("qa34@yopmail.com");
        driver.findElement(By.name("Password")).sendKeys("Vsoft@1234");

        driver.findElement(By.xpath("/html/body/section[1]/div/div/div/div/div/div[6]/button")).click();

        String act_Title = driver.getTitle();

        String exp_Title = "RaptorFi Profile";

        if (act_Title.equals(exp_Title)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.quit();
    }
}

