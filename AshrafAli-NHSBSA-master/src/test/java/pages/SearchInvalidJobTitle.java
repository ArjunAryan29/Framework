package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class SearchInvalidJobTitle extends BrowserDriver {
    public static String job_title = "//input[@id='keyword']";
    public static String search = "//input[@id='search']";
    public static String search_result = "//h3[text()='No result found']";

    public static void search_invalid_job_title() {
        driver.findElement(By.xpath(job_title)).sendKeys("!@#");
        driver.findElement(By.xpath(search)).click();
    }

    public static void search_result_invalid_job_title() {
        String result_message = driver.findElement(By.xpath(search_result)).getText();
        System.out.println("Below are the search result for invalid job title");
        System.out.println(result_message);
        assertEquals("No result found", result_message);
        System.out.println(result_message);
    }

}