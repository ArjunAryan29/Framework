package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class SearchPage extends BrowserDriver {

    public static String title = "//input[@id='keyword']";
    public static String location = "//input[@id='location']";
    public static String search = "//input[@id='search']";

    public static void job_search_valid_data() {

        driver.findElement(By.xpath(title)).sendKeys("nurse");
        driver.findElement(By.xpath(location)).sendKeys("Scotland Corner, Reading");
        driver.findElement(By.xpath(search)).click();

    }

}

