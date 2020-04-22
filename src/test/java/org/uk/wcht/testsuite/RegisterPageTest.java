package org.uk.wcht.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.uk.wcht.pages.HomePage;
import org.uk.wcht.pages.MyAccountPage;
import org.uk.wcht.pages.RegisterPage;
import org.uk.wcht.testbase.TestBase;

public class RegisterPageTest extends TestBase {

    HomePage homePage;
    MyAccountPage myAccountPage;
    RegisterPage registerPage;
    SoftAssert sa = new SoftAssert();

    @BeforeMethod(groups = {"smoke", "sanity", "regression"})
    public void setUpMethod (){
        homePage = new HomePage();
        myAccountPage = new MyAccountPage();
        registerPage = new RegisterPage();

    }

    @Test (groups = {"sanity", "regression"})
    public void verifyThatUserisAbletoNavigatetoLoginPageThruMyAccountPage(){
        homePage.clickOnYourAccountLink();
        myAccountPage.clickOnRegisterLink();
        sa.assertEquals("Register", registerPage.getRegisterText());
        sa.assertAll();

    }
}
