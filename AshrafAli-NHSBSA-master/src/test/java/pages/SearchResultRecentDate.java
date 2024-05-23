package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BrowserDriver;

import java.util.List;

public class SearchResultRecentDate extends BrowserDriver {
    public static void get_search_result_recent_date() {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='sort']"));
        Select select = new Select(dropdown);
        select.selectByValue("publicationDateDesc");
        System.out.println("Below are the list of search result after sorting with recent date");
        List<WebElement> search_result1 = driver.findElements(By.xpath("//ul[@class='nhsuk-list search-results']/li/div/div/h3/a"));
        for (WebElement each_result : search_result1) {
            String job_link = each_result.getAttribute("href");
            String job_title = each_result.getText();
            System.out.println("Job Link: " + job_link);
            System.out.println("Job Title: " + job_title);
        }

    }
}
