package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AcceptTheRequest {
    WebDriver driver;

    private final By ChooseTheWay = new By.ByName("select_transport");  //اختر طريقة الوصول
    private final By TheNext = new By.ById("action-next");    //التالي
    private final By IdType = new By.ByCssSelector("select.nice-select.form-control.row.select2-hidden-accessible"); //نوع الهوية
    private final By EnterId = new By.ByXPath("//*[@id='myId']"); // رقم الهوية
    private final By ChoosePersonalPhoto = new By.ByXPath("//*[@id='personal_photo']"); // صورة شخصية
    private final By ChooseIdPhoto = new By.ByXPath("//*[@id='id_copy']");  //صورة الهوية
    private final By Position = new By.ByXPath("//*[@name='position']");  // المركز
    private final By SaveButton = new By.ByXPath("//*[@id='send']"); // حفظ
    private final By YesSend = new By.ByCssSelector("button.swal2-confirm.btn.font-weight-bold.btn-primary");  //  نعم اارسل


    public AcceptTheRequest(WebDriver driver) {
        this.driver = driver;

    }

    public void ProcessToAccept(String enterid, String enterposition) {


        WebElement ChooseWay = driver.findElement(ChooseTheWay);    //اختر طريقة الوصول
        Select select = new Select((WebElement) ChooseWay);
        select.selectByIndex(2);

        driver.findElement(TheNext).click();    // التالي

        WebElement ChooseTypeId = driver.findElement(IdType);    //نوع الهوية
        Select select1 = new Select((WebElement) ChooseTypeId);
        select1.selectByIndex(1);


        driver.findElement(EnterId).sendKeys(enterid);  // رقم الهوية
        driver.findElement(Position).sendKeys(enterposition);       //المركز
        driver.findElement(ChoosePersonalPhoto).sendKeys("C:\\Users\\p4\\Pictures\\Ahmed.jpg"); // صورة شخصية
        driver.findElement(ChooseIdPhoto).sendKeys("C:\\Users\\p4\\Pictures\\ID.jpg");// صورة الهوية
        driver.findElement(SaveButton).click();      // حفظ
        driver.findElement(YesSend).click();   // نعم ارسال

    }
}
