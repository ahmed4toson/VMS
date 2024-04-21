package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddVisitorPage {
    WebDriver driver;
    //ul.select2-selection__rendered
    private final By SearchBar = new By.ById("selectUsers");        // بحث اختار الزوار
    private final By SaveVisitor = new By.ByXPath("//a[@class='btn btn-success mt-6']");   // حفظ


    public AddVisitorPage(WebDriver driver) {
        this.driver = driver;

    }

    public void AddNewVisitor0()  {

        WebElement SelectVisitor = driver.findElement(SearchBar);
        Select select = new Select((WebElement) SelectVisitor);
        select.selectByIndex(0);

        driver.findElement(SaveVisitor).click();

    }


}
