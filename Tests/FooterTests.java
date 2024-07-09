package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FooterTests extends BaseTest {
    @BeforeMethod
    public void pageSetup(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        mainWindow = driver.getWindowHandle();
        logInPage.inputPasswordField("secret_sauce");
        logInPage.inputUsernameField("standard_user");
        logInPage.clickOnLoginButton();
    }


    @Test
    public void userCanClickOnTwitter() {
        footer.clickOnTwitter();
        switchToNewWindow();

        Assert.assertEquals(driver.getCurrentUrl(), "https://x.com/saucelabs");
    }

    @Test
    public void userCanClickOnFacebook() {
        footer.clickOnFacebook();
        switchToNewWindow();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/saucelabs");
    }

    @Test
    public void userCanClickOnLinkedin() {
        footer.clickOnLinkedIn();
        switchToNewWindow();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.linkedin.com/company/sauce-labs/");
    }



    @AfterMethod
    public void tearDown() {

        String mainWindowHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle).close();
            }
        }
        driver.switchTo().window(mainWindowHandle);
        driver.navigate().refresh();
    }
}
