package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ExtentReportSetup {

    public static WebDriver driver;
    private static ExtentSparkReporter htmlReporter;
    public static ExtentReports extentReports;
    public static ExtentTest test;

    public static void testSetup(){
        htmlReporter = new ExtentSparkReporter("C:\\Users\\פבליק\\IdeaProjects\\PlassonTest\\src\\test\\java\\report\\TestReport.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);
        test = extentReports.createTest("Sample Test", "Choosing a product");
        extentReports.setSystemInfo("Tester", "Pablik");
    }

    public static String takeScreenShot(String imagePath, WebDriver driver){
        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File screenShotFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationOfFile = new File(imagePath + ".jpg");
        try {
            FileUtils.copyFile(screenShotFile, destinationOfFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imagePath + ".jpg";
    }
}
