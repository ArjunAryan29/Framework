package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class SearchInvalidJobLocation extends BrowserDriver {
    public static String job_title = "//input[@id='location']";
    public static String search = "//input[@id='search']";
    public static String search_result = "//h2[contains(text(),'Location not found')]";

    public static void search_invalid_job_location() {
        driver.findElement(By.xpath(job_title)).sendKeys("!@#");
        driver.findElement(By.xpath(search)).click();
    }

    public static void search_result_invalid_job_location() {
        System.out.println("Below are the search result for invalid job location");
        String result_message = driver.findElement(By.xpath(search_result)).getText();
        assertEquals("Location not found", result_message);
        System.out.println(result_message);
    }
}