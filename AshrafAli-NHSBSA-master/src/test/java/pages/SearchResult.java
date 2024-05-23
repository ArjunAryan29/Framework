package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BrowserDriver;

import java.util.List;

public class SearchResult extends BrowserDriver {
    public static String job_result = "//ul[@class='nhsuk-list search-results']/li/div/div/h3/a";

    public static void get_search_result() {
        System.out.println("Below are the list of search result");
        List<WebElement> search_result = driver.findElements(By.xpath(job_result));
        for (WebElement each_result : search_result) {
            String job_link = each_result.getAttribute("href");
            String job_title = each_result.getText();
            System.out.println("Job Link: " + job_link);
            System.out.println("Job Title: " + job_title);
        }
    }
}
