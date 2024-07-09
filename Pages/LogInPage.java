package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
    WebDriver driver;
    WebElement userNameField;
    WebElement passwordField;
    WebElement loginButton;

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUserNameField() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login-button"));
    }
    public void clickOnLoginButton(){
        getLoginButton().click();
    }

    public void inputUsernameField(String username){
        getUserNameField().sendKeys(username);
    }
 public void inputPasswordField(String password){
        getPasswordField().sendKeys(password);
 }

}
