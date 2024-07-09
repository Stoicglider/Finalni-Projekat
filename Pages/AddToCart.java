package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {
    WebDriver driver;
    WebElement slBackpackATC;
    WebElement slBikeATC;
    WebElement slBoltTshirtATC;
    WebElement slFleeceJacketATC;
    WebElement slOnesieATC;
    WebElement slTshirtRedATC;



    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSlBackpackATC() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getSlBikeATC() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
    }

    public WebElement getSlBoltTshirtATC() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    }

    public WebElement getSlFleeceJacketATC() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    }

    public WebElement getSlOnesieATC() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
    }

    public WebElement getSlTshirtRedATC() {
        return driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    }


    public void clickOnATC1(){
        getSlBackpackATC().click();
    }
    public void clickOnATC2(){
        getSlBikeATC().click();
    }

    public void clickOnATC3(){
        getSlBoltTshirtATC().click();
    }

    public void clickOnATC4(){
        getSlFleeceJacketATC().click();
    }

    public void clickOnATC5(){
        getSlOnesieATC().click();
    }

    public void clickOnATC6(){
        getSlTshirtRedATC().click();
    }

}
