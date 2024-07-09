package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckoutTests extends BaseTest {

    @BeforeMethod
    public void pageSetup() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
        logInPage.inputPasswordField("secret_sauce");
        logInPage.inputUsernameField("standard_user");
        logInPage.clickOnLoginButton();
    }

    @Test
    public void firstStepCheckoutTest(){
        addToCart.clickOnATC1();
        cart.clickOnShoppingCartLink();
        cart.clickOnCheckoutButton();
        cart.firstNameInput("pera");
        cart.lastNameInput("peric");
        cart.postalCodeInput("2100");
        cart.clickOnContinueButton();
        String actualUrl = driver.getCurrentUrl();
        String currentUrl = "https://www.saucedemo.com/checkout-step-two.html";
        Assert.assertEquals(currentUrl, actualUrl);
    }




    @Test
    public void fullCheckoutWithItems(){
        addToCart.clickOnATC1();
        cart.clickOnShoppingCartLink();
        cart.clickOnCheckoutButton();
        cart.firstNameInput("pera");
        cart.lastNameInput("peric");
        cart.postalCodeInput("2100");
        cart.clickOnContinueButton();
        cart.clickOnFinishButton();
        String actualUrl = driver.getCurrentUrl();
        String currentUrl = "https://www.saucedemo.com/checkout-complete.html";
        Assert.assertEquals(currentUrl, actualUrl);
    }

    @Test
    public void canceledCheckoutTest(){
        addToCart.clickOnATC1();
        cart.clickOnShoppingCartLink();
        cart.clickOnCheckoutButton();
        cart.firstNameInput("pera");
        cart.lastNameInput("peric");
        cart.postalCodeInput("2100");
        cart.clickOnContinueButton();
        cart.clickOnCancelButton();

        String actualUrl = driver.getCurrentUrl();
        String currentUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(currentUrl, actualUrl);
        WebElement atc1RemoveButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        Assert.assertTrue(atc1RemoveButton.isDisplayed());

    }




    @AfterMethod
    public void removeCookies(){
        driver.manage().deleteAllCookies();
    }

}
