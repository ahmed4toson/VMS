package TestCases;

import Pages.PageBase;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import java.time.Duration;

public class TestBase {

    WebDriver driver;
    PageBase pageBase;

    @BeforeTest
    public void  OpenUrl()
    {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://vms-stg.wakeb.tech/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

//    @AfterTest
//    public void screenshotOnFailure(ITestResult result) {
//        if (result.getStatus() == ITestResult.FAILURE) {
//            System.out.println("Failed!");
//            System.out.println("Taking Screenshot....");
//            pageBase = new PageBase(driver);
//            pageBase.captureScreenshot(driver, result.getName());
//        } else {
//            System.out.println("Test failed, taking screenshot...");
//        }
//
//    }


        @AfterTest
        public void closeurl ()
        {
           //  driver.close();
        }

}


