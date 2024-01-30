package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class dpdown55 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

        driver.manage().window().maximize();

        WebElement CourseName = driver.findElement(By.xpath("//*[@id=\"course\"]"));

        // Using WebDriverWait to wait for the presence of the dropdown options
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));

        // Scroll into view to make the dropdown visible
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CourseName);

        // Click the dropdown to open the options
        CourseName.click();

        // Click the option directly using JavaScript
        String optionText = "java";
        String script = String.format("document.querySelector('#course option[value=\"%s\"]').click();", optionText);
        ((JavascriptExecutor) driver).executeScript(script);

        // Print the selected option
        System.out.println("Selected Option: " + optionText);

        driver.quit();
    }
}


