package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SideMenu {
    WebDriver driver;
    WebElement burgerMenu;
    WebElement about;
    WebElement resetApiState;


    public SideMenu(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBurgerMenu() {
        return driver.findElement(By.id("react-burger-menu-btn"));
    }

    public WebElement getAbout() {
        return driver.findElement(By.id("about_sidebar_link"));
    }

    public WebElement getResetApiState() {
        return driver.findElement(By.id("reset_sidebar_link"));
    }

    public void clickOnBurgerMenu(){
        getBurgerMenu().click();
    }

    public void clickOnAbout(){
        getAbout().click();
    }

    public void clickOnResetapiState(){
        getResetApiState().click();
    }

}
