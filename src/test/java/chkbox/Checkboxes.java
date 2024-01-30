package chkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkboxes {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://artoftesting.com/samplesiteforselenium");

        driver.manage().window().maximize();

        // Wait for the checkbox to be clickable
        WebDriverWait wait = new WebDriverWait(driver, 10);
        By checkboxLocator = By.xpath("//*[@id=\"commonWebElements\"]/form[2]/input[1]");
        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(checkboxLocator));

        // Scroll to the checkbox if needed
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", checkbox);

        // Click the checkbox
        checkbox.click();
        
        // Optionally, you may want to add some additional actions or verifications here.

        // Close the browser
        driver.quit();
    }
}
