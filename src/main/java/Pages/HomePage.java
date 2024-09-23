package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    private final By Requests =new By.ByCssSelector("a.btnbtn-primary");


    public HomePage (WebDriver driver)
    {
        this.driver = driver;
    }


    public void VisitorRequest ()
    {
     //   driver.findElement(Requests).click();
    }
}
