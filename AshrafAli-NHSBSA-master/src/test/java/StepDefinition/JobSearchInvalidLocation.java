package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static pages.SearchInvalidJobLocation.search_invalid_job_location;
import static pages.SearchInvalidJobLocation.search_result_invalid_job_location;
import static utility.BrowserDriver.driver;

public class JobSearchInvalidLocation {
    @Given("I am a job seeker on NHS Jobs website using {string} for invalid location search")
    public void nhs_home_page_invalid_location(String browser) throws Throwable {
        switch (browser.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
        }
        driver.get("https://www.jobs.nhs.uk/candidate/search");
        driver.manage().window().maximize();
        System.out.println("Title of the page:"+driver.getTitle());
        /*get_nhs_home_page();*/
    }

    @When("I enter incorrect location in search")
    public void user_enter_invalid_job_location() throws Throwable {
        search_invalid_job_location();
    }

    @Then("I should get no location found")
    public void user_view_search_results() throws Throwable {
        search_result_invalid_job_location();
    }

}
