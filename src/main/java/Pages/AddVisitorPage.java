package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddVisitorPage {
    WebDriver driver;
    //ul.select2-selection__rendered
    private final By SearchBar = new By.ByCssSelector("span.select2-selection.select2-selection--multiple");        // بحث اختار الزوار
    private final By user = new By.ByXPath("//*[@id=\"select2-selectUsers-results\"]/li[5]");
    private final By SaveVisitor = new By.ByXPath("//a[@class='btn btn-success mt-6']");   // حفظ


    public AddVisitorPage(WebDriver driver) {
        this.driver = driver;

    }

    public void AddNewVisitor0()  {

//        WebElement SelectVisitor = driver.findElement(SearchBar);
//        Select select = new Select((WebElement) SelectVisitor);
//        select.selectByIndex(1);
        driver.findElement(SearchBar).click();
        driver.findElement(user).click();
        driver.findElement(SaveVisitor).click();

    }


}
