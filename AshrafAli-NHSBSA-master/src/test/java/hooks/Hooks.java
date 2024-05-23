package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import utility.BrowserDriver;


public class Hooks {

    private WebDriver driver;
//    @Before
//    public void setup() {
//           // System.setProperty("webdriver.chrome.driver", "C:\\Users\\anith\\Downloads\\chromedriver.exe");
////            driver = new ChromeDriver();
////            driver.manage().window().maximize();
////            driver.get("https://www.jobs.nhs.uk/candidate/search");
////            driver.manage().window().maximize();
////            System.out.println("Title of the page:" + driver.getTitle());
//    }

        @After
    public void teardown() {
            if (driver != null) {
                driver.quit();
            }
        }
    }
