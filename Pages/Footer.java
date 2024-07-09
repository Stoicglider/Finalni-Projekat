package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer {
    WebDriver driver;
    WebElement twitter;
    WebElement facebook;
    WebElement linkedIn;

    public Footer(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getTwitter() {
        return driver.findElement(By.cssSelector("a[data-test='social-twitter']"));
    }

    public WebElement getFacebook() {
        return driver.findElement(By.cssSelector("a[data-test='social-facebook']"));
    }

    public WebElement getLinkedIn() {
        return driver.findElement(By.cssSelector("a[data-test='social-linkedin']"));
    }

    public void clickOnTwitter (){
        getTwitter().click();
    }
    public void clickOnFacebook(){
        getFacebook().click();
    }
    public void clickOnLinkedIn(){
        getLinkedIn().click();
    }
}
