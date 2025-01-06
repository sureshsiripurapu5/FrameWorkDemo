package frameWork;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseTest {
    public WebDriver driver;

    @BeforeSuite
    public void initialization(){
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeTest
    public void launchApplication(){
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void getScreenshotIfTestFails(ITestResult iTestResult) throws IOException {
        System.out.println("iTestResult.getStatus()::"+iTestResult.getStatus());
        System.out.println("ITestResult.FAILURE::"+ITestResult.FAILURE);
        if (iTestResult.getStatus()==ITestResult.FAILURE){
            takingScreenshot();
        }

    }
    public void takingScreenshot() throws IOException {
        TakesScreenshot takesScreenshot=(TakesScreenshot) driver;
        File sourceFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
        File targetFile=new File(System.getProperty("user.dir")+"\\screenShots\\loginFailed.png");

        FileUtils.copyFile(sourceFile,targetFile);

    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}
