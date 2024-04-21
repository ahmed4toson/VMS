package TestCases;

import Pages.*;
import org.apache.poi.ss.formula.functions.T;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {


    Loginpage loginpage;
    CheckSite checkSite;
    HomePage homePage;
    VisitRequestsList Visit1;
    NewVisitRequest newVisitRequest;
    AddVisitorPage addVisitorPage;
    AcceptTheRequest acceptTheRequest;
    PageBase pageBase;

    @Test(priority = 1)
    public void LoginSuccessful()  {

        loginpage = new Loginpage(driver);
        loginpage.login("root@wakeb.com", "123456");


        checkSite = new CheckSite(driver);
        checkSite.Chooselocate();


    }


    @Test(priority = 2)
    public void chooselocate() {

        homePage = new HomePage(driver);
        homePage.VisitorRequest();


        Visit1 = new VisitRequestsList(driver);
        Visit1.CreateNewRequest();


    }

    @Test(priority = 3)
    public void NewVisitRequest0()  {
        newVisitRequest = new NewVisitRequest(driver);
        newVisitRequest.CreateNewVisitRequest("business", "04172024", "0700a", "04182024", "0500p", "Welcome at wakeb team ");


        addVisitorPage = new AddVisitorPage(driver);
        addVisitorPage.AddNewVisitor0();


        newVisitRequest.SaveButton();

    }

    @Test(priority = 4)
    public void Show() {

        Visit1.NavigateToShowVisit();

    }


    @Test(priority = 5)
    public void ContiuneTheAcceptance() {
        acceptTheRequest = new AcceptTheRequest(driver);
        acceptTheRequest.ProcessToAccept("1234567890", "NewPosition");
    }

}
