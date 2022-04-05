package stepDefinitions;

import Login.loginValidAkun;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.lv.Tad;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import yourCart.addProduct;
import yourCart.cart;

import java.util.concurrent.TimeUnit;

import static Utils.chromeBrowser.driver;

public class stepDefinition {


    @Given(": Open the Swag labs in browser")
    public void openTheSwagLabsInBrowser() {
//        System.setProperty("BASE_DRIVER_CHROME", "CHROME_DRIVER_LOCATION");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
    }

    @And(": Input username and password")
    public void inputUsernameAndPassword() {
//        loginValidAkun loginAkun = new loginValidAkun(driver);
//
//        loginAkun.InputUsername().sendKeys("standard_user");
//        loginAkun.InputPassword().sendKeys("secret_sauce");

        loginValidAkun login = PageFactory.initElements(driver, loginValidAkun.class);
        login.InputUsername("standard_user");
        login.InputPassword("secret_sauce");

    }

    @And(": Click login")
    public void clickLogin() {

        loginValidAkun clck = PageFactory.initElements(driver, loginValidAkun.class);
        clck.ClickButton();

//        loginValidAkun ClickLogin = new loginValidAkun(driver);
//
//        ClickLogin.ClickButtonLogin().click();
    }

    @Then(": System displays the product page")
    public void systemDisplaysTheProductPage() {
        driver.getCurrentUrl();
    }

    @And(": Add to cart products")
    public void addToCartProducts() {

        addProduct AddProduct = new addProduct(driver);

        AddProduct.addProduct1().click();
        AddProduct.addProduct2().click();

    }

    @And(": Click the cart icon")
    public void clickTheCartIcon() {

        cart ClickCart = new cart(driver);

        ClickCart.CickicnCart().click();

    }
}



