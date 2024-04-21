package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Loginpage {
   WebDriver driver;
   private final By email = new By.ById("email");   //email
   private final By password = new By.ById("pwd"); //pass
   private final By ButtonLogin =new By.ByCssSelector("button.add_loading.btn.btn-primary.font-weight-bolder.font-size-h6.my-3.mr-3");
public Loginpage(WebDriver driver)
{
    this.driver = driver;
}


public void login (String enteremail , String enterPassword) {


   driver.findElement(email).sendKeys(enteremail);
   driver.findElement(password).sendKeys(enterPassword);
   driver.findElement(ButtonLogin).click();

   String expectedUrl = "https://vms-v2.wakeb.tech/ar/dashboard/check-site";
   String actualUrl = driver.getCurrentUrl();
   Assert.assertEquals(actualUrl, expectedUrl, "URLs do not match");


}

}
