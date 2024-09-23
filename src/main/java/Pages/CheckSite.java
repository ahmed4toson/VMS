package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CheckSite {

    WebDriver driver;

    private final By chooseGate = By.id("select_site");




  //  private final By locate = new By.ByCssSelector("select.nice-select.form-control.row.select2-hidden-accessible"); // تحديد الموقع
    //  private final By chooselocate1 =new By.ByXPath("//li[@class='select2-results__option'][1]"); // اختيار الموقع
    private final By Submitsite =new By.ByXPath("//*[@id=\"submitSite\"]");             // الذهاب الي الرئيسة
    private final By visit = new By.ByXPath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/a");     // التصاريح
    private final By visitRequestlist = new By.ByXPath("//*[@id=\"kt_aside_menu\"]/ul/li[4]/div/ul/li[2]/a/span");





   //  private final By visit = new By.ByXPath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/a/span");     // التصاريح
   // private final By visitRequestlist = new By.ByXPath("//*[@id=\"kt_aside_menu\"]/ul/li[2]/div/ul/li[2]/a/span");


 public  CheckSite(WebDriver driver)
 {
  this.driver=driver ;
 }


public void Chooselocate() {


    Select select = new Select(driver.findElement(chooseGate) );
    select.selectByIndex(2);

    String expectedUrl = "https://vms-stg.wakeb.tech/ar/dashboard/reports";
    String actualUrl = driver.getCurrentUrl();
    Assert.assertEquals(actualUrl, expectedUrl, "URLs do not match");

    WebElement element = driver.findElement(visit);      //  handhover
    Actions actions = new Actions(driver);
    actions.moveToElement(element).build().perform();

    driver.findElement(visitRequestlist).click();     // تصاريح الزيارات

}

}
