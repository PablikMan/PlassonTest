import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.FlowSolutionPage;
import pages.MainPage;
import utilities.Driver;
import utilities.ExtentReportSetup;

public class MainTest extends ExtentReportSetup {

    public static WebDriver driver;

    @BeforeClass
    private static WebDriver beforeTest(){
        driver = Driver.getDriver();
        testSetup();
        test.log(Status.INFO, "Beginning of test");
        return driver;
    }

    @Test(priority = 1)
    private static void test_01(){
        MainPage.openPage(driver);
        test.log(Status.PASS, "Page has opened successfully");
    }

    @Test(priority = 2)
    private static void test_02(){
        MainPage.clickOnFirstTab(driver);
        test.log(Status.PASS, "Entering the 'Flow Solution' tab");
    }

    @Test(priority = 3)
    private static void test_03(){
        FlowSolutionPage.assertPageTitle(driver);
        test.log(Status.PASS, "The page title is as it should be");
    }

    @Test(priority = 4)
    private static void test_04(){
        FlowSolutionPage.chooseProduct(driver);
        test.log(Status.PASS, "Entering the 'Tee' product section");
    }

    @Test(priority = 5)
    private static void test_05(){
        FlowSolutionPage.assertTeePageTitle(driver);
        test.log(Status.PASS, "The page title is as it should be");
    }

    @Test(priority = 6)
    private static void test_06(){
        FlowSolutionPage.chooseTypeOfProduct(driver);
        test.log(Status.PASS, "Entering the 'Tee - 90' catalogue");
    }

    @Test(priority = 7)
    private static void test_07(){
        FlowSolutionPage.chooseHeaviestTypeOfProduct(driver);
        test.log(Status.PASS, "Choosing the heaviest type of 'Tee - 90'");
    }

    @Test(priority = 8)
    private static void test_08(){
        FlowSolutionPage.assertProductID(driver);
        test.log(Status.PASS, "The product ID is as it should be");

    }

    @AfterClass
    private static void endOfTest(){
        test.log(Status.INFO, "End of test");
        extentReports.flush();
        driver.close();
    }
}
