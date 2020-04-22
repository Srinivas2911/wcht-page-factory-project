package org.uk.wcht.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.uk.wcht.utility.Utility;

public class MyAccountPage extends Utility {

    //Log the webelements and methods into Log4j reports
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

//Using selenium @FindBy and initElement methods
// using _ help separate from variable

//    By myAccountText = By.xpath("//div[@class='panel-heading']");
//    By registerLink = By.partialLinkText("Regist");

    @FindBy(xpath = "//div[@class='panel-heading']")
    WebElement _myAccountText;

    @FindBy(partialLinkText = "Regist")
    WebElement _registerLink;


    public void verifyMyAccountText() {
        Reporter.log("Displaying My Account Text Clicking on Your Account Link :" + _myAccountText.toString() + "<br>");
        verifyThatTextIsDisplayed(_myAccountText, " My Account ");
        log.info("Clicking on Your Account Link :" + _myAccountText.toString());
    }

    public String getMyAccountText() {
        Reporter.log("Displaying My Account Text  :" +getTextFromElement(_myAccountText)+" "+ _myAccountText.toString() + "<br>");
        log.info("Displaying My Account Text :" +getTextFromElement(_myAccountText)+" "+ _myAccountText.toString());
        return getTextFromElement(_myAccountText);
    }

    public void clickOnRegisterLink() {
        Reporter.log("Clicking on Register Link :" + _registerLink.toString() + "<br>");
        clickOnElement(_registerLink);
        log.info("Clicking on Register Link :" + _registerLink.toString());


    }
}