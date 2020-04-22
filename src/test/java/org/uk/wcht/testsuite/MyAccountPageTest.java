package org.uk.wcht.testsuite;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.uk.wcht.pages.HomePage;
import org.uk.wcht.pages.MyAccountPage;
import org.uk.wcht.testbase.TestBase;


public class MyAccountPageTest extends TestBase {
    HomePage homePage;
    MyAccountPage myAccountPage;
    SoftAssert sa = new SoftAssert();

    @BeforeMethod(groups = {"smoke", "sanity", "regression"})
    public void setUpMethod (){
        homePage = new HomePage();
        myAccountPage = new MyAccountPage();
    }

    @Test (groups = {"smoke", "regression"})
    public void verifyThatUserIsAbletoNavigateToYourAccountPage(){
        homePage.clickOnYourAccountLink();
        myAccountPage.verifyMyAccountText();
        sa.assertEquals("My Account", myAccountPage.getMyAccountText());
        sa.assertAll();
    }
}
