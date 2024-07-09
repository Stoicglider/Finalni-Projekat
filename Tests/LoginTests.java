package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {


    @BeforeMethod
    public void pageSetup(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
    }



    @Test
        public void validLogIn(){
        logInPage.inputUsernameField("standard_user");
        logInPage.inputPasswordField("secret_sauce");
        logInPage.clickOnLoginButton();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Test
        public void invalidUsernameLogin(){
        logInPage.inputUsernameField("nestandarad_user");
        logInPage.inputPasswordField("secret_sauce");
        logInPage.clickOnLoginButton();
        WebElement errorMessage = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }


    @Test
    public void invalidPasswordLogin(){
        logInPage.inputUsernameField("standard_user");
        logInPage.inputPasswordField("secrettttt_sauce");
        logInPage.clickOnLoginButton();
        WebElement errorMessage = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }


    @Test
    public void emptyInputFieldLogin(){
        logInPage.inputUsernameField("");
        logInPage.inputPasswordField("");
        logInPage.clickOnLoginButton();
        WebElement errorMessageDiv = driver.findElement(By.cssSelector(".error-message-container.error"));
        Assert.assertTrue(errorMessageDiv.isDisplayed());
    }
@AfterMethod
    public void removeCookies(){
        driver.manage().deleteAllCookies();
}

}
