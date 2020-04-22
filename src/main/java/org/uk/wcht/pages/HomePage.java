package org.uk.wcht.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.uk.wcht.utility.Utility;

public class HomePage extends Utility {

    //Log the webelements and methods into Log4j reports
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

//Using selenium @FindBy and initElement methods
// using _ help separate from variable


//    By yourHomeLink = By.linkText("Your home");
//    By yourCommunityLink = By.linkText("Your community");
//    By findAHomeLink = By.linkText("Find a home");
//    By yourAccountLink = By.xpath("//span[contains(text(),'Your account')]");

    @FindBy(linkText = "Your home")
    WebElement _yourHomeLink;

    @FindBy(xpath = "//span[contains(text(),'Your account')]")
    WebElement _yourAccountLink;


    public void homeLinkIsDisplayed() {
        Reporter.log("Displaying Home Link " + _yourHomeLink.toString() + "<br>");
        verifyThatElementIsDisplayed(_yourHomeLink);
        log.info("Displaying Home Link : " + _yourHomeLink.toString());
    }

    public void yourAccountLinkIsDisplayed() {
        Reporter.log("Displaying Your Account Link " + _yourAccountLink.toString() + "<br>");
        verifyThatElementIsDisplayed(_yourAccountLink);
        log.info("Displaying Your Account Link : " + _yourAccountLink.toString());


    }

    public String getYourAccountText(){
        Reporter.log("Displaying Your Account Text " + _yourAccountLink.toString() + "<br>");
        log.info("Displaying Your Account Text : " + _yourAccountLink.toString());
        return getTextFromElement(_yourAccountLink);

    }

    public void clickOnYourHomeLink() {
        Reporter.log("Clicking on Your Home Link :"+ _yourAccountLink.toString()+ "<br>");
        clickOnElement(_yourHomeLink);
        log.info("Clicking on Your Home Link :"+ _yourAccountLink.toString());
    }

    public void clickOnYourAccountLink() {
        Reporter.log("Clicking on Your Account Link :"+ _yourAccountLink.toString()+ "<br>");
        clickOnElement(_yourAccountLink);
        log.info("Clicking on Your Account Link :"+ _yourAccountLink.toString());

    }
}
