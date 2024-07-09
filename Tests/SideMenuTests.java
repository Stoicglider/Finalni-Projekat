package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SideMenuTests extends BaseTest {
    @BeforeMethod
    public void pageSetup(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        logInPage.inputPasswordField("secret_sauce");
        logInPage.inputUsernameField("standard_user");
        logInPage.clickOnLoginButton();
    }
@Test
public void aboutSideMenuTest(){
        sideMenu.clickOnBurgerMenu();
        sideMenu.clickOnAbout();
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://saucelabs.com/";
        Assert.assertEquals(expectedUrl,currentUrl);
}

    @AfterMethod
    public void removeCookies(){
        driver.manage().deleteAllCookies();
    }
}
