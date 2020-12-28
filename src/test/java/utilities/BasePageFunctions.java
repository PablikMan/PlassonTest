package utilities;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePageFunctions extends ExtentReportSetup {

    public static WebDriver driver;

    private static WebElement findElement(By locator){
        driver = Driver.getDriver();
        return driver.findElement(locator);
    }

    public static void clickElement(By locator){
        try {
            findElement(locator).click();
        }catch (NoSuchElementException e){
            test.log(Status.FAIL, "Could not find locator: " + locator);
            takeScreenShot("C:\\Users\\פבליק\\IdeaProjects\\PlassonTest\\src\\test\\java\\report\\ScreenShot", driver);
        }
    }

    public static void sendKeysToElement(By locator, String string){
        try {
            findElement(locator).sendKeys(string);
        }catch (NoSuchElementException e){
            test.log(Status.FAIL, "Could not find locator: " + locator);
            takeScreenShot("C:\\Users\\פבליק\\IdeaProjects\\PlassonTest\\src\\test\\java\\report\\ScreenShot", driver);
        }
    }
}
