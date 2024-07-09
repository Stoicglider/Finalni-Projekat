package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart {
    WebDriver driver;
    WebElement checkoutButton;
    WebElement continueShoppingButton;
    WebElement firstName;
    WebElement lastName;
    WebElement zipPostalCode;
    WebElement continueButton;
    WebElement cancelButton;
    WebElement backHomeButton;
    WebElement shoppingCartLink;
    WebElement finishButton;
    WebElement cartBadge;



    public Cart(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(By.id("checkout"));
    }

    public WebElement getContinueShoppingButton() {
        return driver.findElement(By.id("continue-shopping"));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("first-name"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("last-name"));
    }

    public WebElement getZipPostalCode() {
        return driver.findElement(By.id("postal-code"));
    }

    public WebElement getContinueButton() {
        return driver.findElement(By.id("continue"));
    }

    public WebElement getCancelButton() {
        return driver.findElement(By.id("cancel"));
    }

    public WebElement getBackHomeButton() {
        return driver.findElement(By.id("back-to-products"));
    }

    public WebElement getCartBadge() {
        return driver.findElement(By.cssSelector("shopping_cart_badge"));
    }

    public void firstNameInput(String firstName){
        getFirstName().sendKeys(firstName);
    }
    public void lastNameInput(String lastName){
        getLastName().sendKeys(lastName);
    }
    public void postalCodeInput(String code){
        getZipPostalCode().sendKeys(code);
    }

    public WebElement getShoppingCartLink() {
        return driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a"));
    }


    public WebElement getFinishButton() {
        return driver.findElement(By.id("finish"));
    }
/////////////////////////////////////////////////////////////////////////////////////////////////
    public void clickOnCancelButton(){
        getCancelButton().click();
    }

    public void clickOnContinueButton(){
        getContinueButton().click();
    }

    public void clickOnCheckoutButton(){
        getCheckoutButton().click();
    }

    public void clickOnContinueShoppingButton(){
        getContinueShoppingButton().click();
    }

    public void clickOnBackHomeButton(){
        getBackHomeButton().click();
    }

    public void clickOnShoppingCartLink(){
        getShoppingCartLink().click();
    }

    public void clickOnFinishButton(){
        getFinishButton().click();
    }
}
