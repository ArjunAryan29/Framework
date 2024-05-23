package utility;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;


public class BrowserDriver {
    public static RemoteWebDriver driver;

    public static void close() throws InterruptedException {
        driver.close();
    }

    public static void sendKeysByXPath(WebDriver driver, String xpath, String text) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.clear();  // Clears the field before entering text
        element.sendKeys(text);
    }
    public static void clickByXpath(WebDriver driver, String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }
    public static void DDByVisibleText(WebDriver driver, String xpath, String text) {
        WebElement dropdown = driver.findElement(By.xpath(xpath));
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);
    }

    public static void switchToNextTab() {
        // Get the window handles
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        // Switch to the newly opened tab
        driver.switchTo().window(tabs.get(1));
        // Close the newly opened tab
        driver.close();
//        // Switch back to the original tab
        driver.switchTo().window(tabs.get(0));
    }

    public static void acceptAlert() {
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {
            // Alert not present, do nothing or handle the exception as needed
        }
    }

    public static void switchToFrame(WebDriver driver, String frameLocator) {
        WebElement frameElement = driver.findElement(By.xpath(frameLocator));
        driver.switchTo().frame(frameElement);
    }

    public static void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public static void clearText(WebDriver driver, String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.clear();
    }

    public  static String getTextMethod(String actual) {
        String Text = driver.findElement(By.xpath(actual)).getText();
        return Text;
    }


}
