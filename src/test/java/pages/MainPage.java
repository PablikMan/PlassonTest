package pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BasePageFunctions;
import utilities.Driver;

import java.time.Duration;

public class MainPage extends BasePageFunctions {

    //opens up the web page
    public static void openPage(WebDriver driver){
        driver.manage().window().maximize();
        driver.get("https://www.plasson.com/");
    }

    //selecting the "Flow Solution" tab in the page
    public static void clickOnFirstTab(WebDriver driver){
        final By flow_solutions_tab = By.xpath("//a[@title='undefinedקישור 1מתוך 3  לא נבחר']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(flow_solutions_tab)));
        clickElement(flow_solutions_tab);
    }
}
