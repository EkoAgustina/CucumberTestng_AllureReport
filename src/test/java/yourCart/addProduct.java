package yourCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addProduct {
    public WebDriver driver;

    By prdct1 =By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    By prdct2 =By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");

    public addProduct (WebDriver driver){

        this.driver=driver;
    }

    public WebElement addProduct1(){return driver.findElement(prdct1);}
    public WebElement addProduct2(){return driver.findElement(prdct2);}
}
