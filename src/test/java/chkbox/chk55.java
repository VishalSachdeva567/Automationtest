package chkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class chk55 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        WebDriver driver = new ChromeDriver();

        driver.get("https://artoftesting.com/samplesiteforselenium");

        driver.manage().window().maximize();

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        System.out.println("Total Number of Checkboxes: " + checkboxes.size());

        WebDriverWait wait = new WebDriverWait(driver, 10);

        for (int i = 0; i < checkboxes.size(); i++) {
            try {
                checkboxes.get(i).click();
            } catch (Exception e) {
                // Handle the exception or log the error message if needed
                System.out.println("Error clicking checkbox at index " + i + ": " + e.getMessage());
            }

            // Wait for the overlaying element to be invisible
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("google_ads_iframe_/21849154601,22899106103/Ad.Plus-Anchor_0__container__")));
        }

        // Close the WebDriver
        driver.quit();
    }
}
