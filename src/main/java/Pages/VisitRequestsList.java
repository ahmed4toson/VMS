package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


//جدول تصريح الزيارات + زر تصريح الزيارة
public class VisitRequestsList {
    WebDriver driver ;
    private final By NewRequest = new By.ByCssSelector("a.btn.btn-primary"); // تصريح جديد
    private final By showVisit =new By.ByCssSelector("a.btn.btn-outline-success.btn-sm.ml-2"); // ايقونة اظهار
    private final By ButtonTheVisitor = new By.ById("contact-tab-1");   // الزائرين في التفاصيل
    private final By ClickHere = new By.ByXPath("//*[@id=\"contact-1\"]/div/div/table/tbody/tr/td[8]/a");  // أضغط هنا


    public VisitRequestsList(WebDriver driver)
    {
        this.driver = driver ;
    }

    public void CreateNewRequest ()
    {
        driver.findElement(NewRequest).click();
    }

    public void NavigateToShowVisit () {

   driver.findElement(showVisit).click();

   driver.findElement(ButtonTheVisitor).click();

   driver.findElement(ClickHere).click();
   driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));


//
//        WebElement ChooseWay = driver.findElement(ChooseTheWay);    //اختر طريقة الوصول
//        Select select =new Select((WebElement) ChooseWay);
//        select.selectByIndex(2);



    }

}
