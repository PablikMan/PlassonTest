package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.BasePageFunctions;

import java.time.Duration;

public class FlowSolutionPage extends BasePageFunctions {

    //checking if the page title matches to what it is supposed to show
    public static void assertPageTitle(WebDriver driver){
        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "PLASSON | Flow Solutions";
        try {
            Assert.assertEquals(expectedPageTitle, actualPageTitle);
        }catch (AssertionError e){
            test.log(Status.FAIL, "Assertion has failed");
        }
    }

    //choosing the type of product
    public static void chooseProduct(WebDriver driver){
        final By tee_product = By.xpath("//a[@href='/catalogue/group/112/nameblock/Tees']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(tee_product)));
        clickElement(tee_product);
    }

    //checking if the page title matches to what it is supposed to show
    public static void assertTeePageTitle(WebDriver driver){
        String actualPageTitle = driver.getTitle();
        String expectedPageTitle = "PLASSON | Flow Solutions - Tees";
        try {
            Assert.assertEquals(expectedPageTitle, actualPageTitle);
        }catch (AssertionError e){
            test.log(Status.FAIL, "Assertion has failed");
        }
    }

    //choosing the kind of product
    public static void chooseTypeOfProduct(WebDriver driver){
        final By tee_90_types = By.xpath("//a[@href='/catalogue/group/112/nameblock/Tees/family/Tee%252090']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(tee_90_types)));
        clickElement(tee_90_types);
    }

    //choosing the heaviest type of product according to the website
    public static void chooseHeaviestTypeOfProduct(WebDriver driver){
        final By heaviest_type_of_tee = By.xpath("//a[@href='/catalogue/product/2836']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(heaviest_type_of_tee)));
        clickElement(heaviest_type_of_tee);
    }

    //checking if the product ID matches to what it is supposed to show
    public static void assertProductID(WebDriver driver){
        final By item_id = By.xpath("//span[@class='field_value product_code_on_ov_page']");
        String actualItemID = driver.findElement(item_id).getText();
        String expectedItemID = "490404250";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(item_id)));
        try {
            Assert.assertEquals(expectedItemID, actualItemID);
        }catch (AssertionError e){
            test.log(Status.FAIL, "Assertion has failed");
        }
    }
}
