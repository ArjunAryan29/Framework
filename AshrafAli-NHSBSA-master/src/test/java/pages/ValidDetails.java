package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.io.IO;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import utility.BrowserDriver;
import utility.XPathConstants;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;


import static org.junit.Assert.assertEquals;

public class ValidDetails extends BrowserDriver {
    public static String Name = "//*[@id='name']";
    public static String Add_Name = "//*[@id='contactPersonName']";
    public static String Add_Number = "//*[@id='contactPersonPhone']";

    public static void enter_valid_TextBox_details() throws IOException {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Create an Actions object
        WebElement initialElement = driver.findElement(By.xpath(Name));
        Actions actions = new Actions(driver);
        // Perform the sequence of actions
        actions.click(initialElement)
                .sendKeys(" ")  // Press space
                .sendKeys("firstname")  // Enter first text
                .sendKeys("\t")  // Press Tab
                .sendKeys("MiddleName")  // Enter second text
                .sendKeys("\t")  // Press Tab again
                .sendKeys("ThirdName")  // Enter third text
                .sendKeys("\t")  // Press Tab again
                .sendKeys("\n")  // Press Enter
                .perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        BrowserDriver.sendKeysByXPath(driver, XPathConstants.PWD_FIELD_XPATH, "@ryan291121");
        BrowserDriver.sendKeysByXPath(driver, XPathConstants.Email,"Test@test.com");
        BrowserDriver.sendKeysByXPath(driver, XPathConstants.Phone_Number,"07442235829");
        BrowserDriver.sendKeysByXPath(driver, XPathConstants.Conform_Password,"@ryan291121");
        BrowserDriver.sendKeysByXPath(driver, XPathConstants.Address,"548 CBRoad,Ilford,IG26RE");
        BrowserDriver.clickByXpath(driver, XPathConstants.Rdo_Male);
        BrowserDriver.sendKeysByXPath(driver, XPathConstants.User_Name,"Ajju123");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    public static void Country_Dropdown() throws IOException {
        BrowserDriver.DDByVisibleText(driver,XPathConstants.DD_Country,"United Kingdom");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    public static void Third_Party() throws IOException {
        BrowserDriver.clickByXpath(driver, XPathConstants.Third_Party);
        BrowserDriver.acceptAlert();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    public static void Next_tab() throws IOException {
        BrowserDriver.clickByXpath(driver,XPathConstants.Related_Docs);
        BrowserDriver.switchToNextTab();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    public static void DOB() throws IOException {
        BrowserDriver.clickByXpath(driver,XPathConstants.DOB);
        BrowserDriver.clearText(driver,XPathConstants.DOB);
        BrowserDriver.sendKeysByXPath(driver,XPathConstants.DOB,"25/07/1991");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }
    public static void Frame() throws IOException {

//// Switch to the iframe using its ID or name attribute
        driver.switchTo().frame("additionalInfo");
        // Locate the text box inside the iframe
        WebElement textBox = driver.findElement(By.xpath(Add_Name));
        WebElement textBox1 = driver.findElement(By.xpath(Add_Number));
        textBox1.clear();
        textBox1.sendKeys("07442235829");
        driver.switchTo().defaultContent();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    public static void Privacy_Policy() throws IOException {
        BrowserDriver.clickByXpath(driver,XPathConstants.Privacy_Policy);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        BrowserDriver.clickByXpath(driver,XPathConstants.Submit);
    }

    public static void Submit_Success() throws IOException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        System.out.println("Post successful submission:");
        String actualStr = BrowserDriver.getTextMethod(XPathConstants.Final_Msg);
        assertEquals("Submitted Application", actualStr);
        System.out.println(actualStr);
    }

}