package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public LogInPage logInPage;
    public Footer footer;
    public SideMenu sideMenu;
    public Cart cart;
    public AddToCart addToCart;
    public String mainWindow;


    public void switchToNewWindow() {
        closeAllWindows();

        for (String window : driver.getWindowHandles()) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }

    public void closeAllWindows() {
        for (String window : driver.getWindowHandles()) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                driver.close();
            }
            break;
        }
    }

@BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        logInPage = new LogInPage(driver);
        footer  = new Footer(driver);
        sideMenu = new SideMenu(driver);
        cart = new Cart(driver);
        addToCart = new AddToCart(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
