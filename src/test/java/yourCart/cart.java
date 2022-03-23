package yourCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cart {

    public WebDriver driver;

    By icnCart = By.xpath("//a[.='2']");

    public cart(WebDriver driver){
        this.driver=driver;
    }

    public WebElement CickicnCart(){return driver.findElement(icnCart);}
}
