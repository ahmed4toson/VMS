package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.apache.commons.collections.CollectionUtils.select;

// اضافة تصريح للزائر
public class NewVisitRequest {

  WebDriver driver ;

 private final By SelectLocation = new By.ByCssSelector("select.select3.form-control.row.visit_type.select2-hidden-accessible"); //موقع المقابلة
  private final By SelectGate = new By.ByXPath("//*[@id=\"gate_id\"]");              // البوابة
  private final By SelectBuilding = new By.ByXPath("//select[@id=\"building_id\"]");  //المبني
  private final By SelectFloor = new By.ByXPath("//select[@id=\"floor_id\"]");   //الطابق
  private final By SelectHost = new By.ByXPath("//select[@id='host_id']");   // المضيف
  private final By SelectDepartment = new By.ByXPath("//select[@name='department_id']"); //القسم
  private final By SelectTypVisit  = new By.ByXPath("//select[@name='visit_type_id']"); //نوع الزيارة
  private final By PurposeDescription = new By.ByXPath("//input[@name='description']"); // الغرض
  private final By DaysOfvisit = new By.ByXPath("//select[@name='repeat']"); //ايام الزيارة
  private final By FromDate =new By.ByXPath("//input[@id='from_date']");    //تبداء من
  private final By FromTime =new By.ById("from_fromtime");   //بداية الوقت
  private final By ToDate = new By.ById("to_date");    // حتي يوم
 private final By Totime = new By.ById("to_totime"); // نهاية الوقت
 private final By Comment = new By.ByName("comment"); // كومنت
 private final By AddVisitor =new By.ById("AddVisitor");  // زر اضافة زائر

 private final By ButtonSaveRequest =new By.ById("submitVisitForm");


  public NewVisitRequest(WebDriver driver)
  {
      this.driver = driver;
  }




   public void CreateNewVisitRequest (String enterpurpose,String enterdate ,String enterchoosetime, String enterTodate ,String chooseendtime ,String entercomment)

  {

  WebElement SelectLocation1 = driver.findElement(SelectLocation);  //موقع المقابلة
  Select select = new Select((WebElement) SelectLocation1);
  select.selectByIndex(1);

   WebElement SelectGate1 = driver.findElement(SelectGate);       //البوابة
  Select select1 =new Select((WebElement) SelectGate1);
  select1.selectByIndex(2);


  WebElement SelectBuilding1 = driver.findElement(SelectBuilding);   //المبني
  Select select2 = new Select((WebElement)SelectBuilding1 );
  select2.selectByIndex(1);

  WebElement SelectFloor1 =driver.findElement(SelectFloor);    // الطابق
  Select select3 = new Select((WebElement)SelectFloor1);
  select3.selectByIndex(3);


  WebElement SelectHost1 = driver.findElement(SelectHost);  // المضيف
  Select select4 =new Select((WebElement)SelectHost1);
  select4.selectByIndex(1);

  WebElement SelectDepartment1 = driver.findElement(SelectDepartment);  // القسم
  Select select5 = new Select((WebElement)SelectDepartment1);
  select5.selectByIndex(2);

  WebElement SelectTypVisit1 = driver.findElement(SelectTypVisit); // نوع الزيارة
  Select select6 = new Select((WebElement) SelectTypVisit1);
  select6.selectByIndex(1);
 
  driver.findElement(PurposeDescription).sendKeys(enterpurpose);   // الغرض

   WebElement DaysVisit0 = driver.findElement(DaysOfvisit);     //ايام الزيارة
   Select select7 = new Select((WebElement) DaysVisit0);
   select7.selectByIndex(1);


   driver.findElement(FromDate).sendKeys(enterdate);   //بداية اليوم

  // driver.findElement(FromTime).sendKeys(enterchoosetime);   // بداية الوقت

   driver.findElement(ToDate).sendKeys(enterTodate);    // الي يوم

 //  driver.findElement(Totime).sendKeys(chooseendtime);  // نهاية الوقت

   driver.findElement(Comment).sendKeys(entercomment);  // تعليق


   driver.findElement(AddVisitor).click();   // زر اضافة زائر


  }

   public void SaveButton ()  {
driver.findElement(ButtonSaveRequest).click();

//    Actions action = new Actions(driver);
//    WebElement we = driver.findElement(ButtonSaveRequest );
//    action.moveToElement(we).build().perform();

//    WebElement element= driver.findElement(ButtonSaveRequest);
//   Actions actions = new Actions(driver);
//   actions.moveToElement(element).build().perform();



   }

}
