package org.uk.wcht.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.uk.wcht.utility.Utility;

public class RegisterPage extends Utility {

    //Log the webelements and methods into Log4j reports
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

//Using selenium @FindBy and initElement methods
// using _ help separate from variable

//    By registerText = By.xpath("//h3[@class='panel-title']");

    @FindBy(xpath = "//h3[@class='panel-title']")
    WebElement _registerText;

    public void verifyRegisterText() {
        Reporter.log("Displaying Register Text  :" + _registerText.toString() + "<br>");
        verifyThatTextIsDisplayed(_registerText, "Register");
        log.info("Displaying Register Text :" + _registerText.toString());
    }

    public String getRegisterText() {
        Reporter.log("Getting Register Text  :" +getTextFromElement(_registerText) + _registerText.toString() + "<br>");
        log.info("Getting Register Text " +getTextFromElement(_registerText)+ _registerText.toString());
        return getTextFromElement(_registerText);
    }
}
