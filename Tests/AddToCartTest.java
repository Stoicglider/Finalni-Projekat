package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToCartTest extends BaseTest {

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
    public void addToCartTestWith1Item(){
        addToCart.clickOnATC1();
        WebElement removeButton = driver.findElement(By.id("remove-sauce-labs-backpack"));
        Assert.assertTrue(removeButton.isDisplayed());
    }



    @Test
    public void addToCartWith3Items(){
        addToCart.clickOnATC2();
        addToCart.clickOnATC3();
        addToCart.clickOnATC4();
        WebElement removeButton2 = driver.findElement(By.id("remove-sauce-labs-bike-light"));
        WebElement removeButton3 = driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
        WebElement removeButton4 = driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
        Assert.assertTrue(removeButton2.isDisplayed());
        Assert.assertTrue(removeButton3.isDisplayed());
        Assert.assertTrue(removeButton4.isDisplayed());
    }


    @AfterMethod
    public void removeCookies(){
        driver.manage().deleteAllCookies();
    }
}
