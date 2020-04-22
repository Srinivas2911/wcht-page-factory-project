package org.uk.wcht.testbase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.uk.wcht.basepage.BasePage;
import org.uk.wcht.browserselector.BrowserSelector;
import org.uk.wcht.loadProperty.LoadProperty;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();
    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("browser");

    @BeforeMethod (groups = {"smoke", "sanity", "regression"})
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @AfterMethod (groups = {"smoke", "sanity", "regression"})
    public void tearDown() {
        driver.quit();
    }
}
