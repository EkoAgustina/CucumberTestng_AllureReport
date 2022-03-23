package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginValidAkun {

    public WebDriver driver;

    By Usrnm = By.xpath("//input[@id='user-name']");
    By Psswrd = By.xpath("//input[@id='password']");
    By BttnLgn = By.xpath("//input[@id='login-button']");

    public loginValidAkun (WebDriver driver){
        this.driver=driver;

    }

    public WebElement InputUsername(){return driver.findElement(Usrnm);}
    public WebElement InputPassword(){return driver.findElement(Psswrd);}
    public WebElement ClickButtonLogin(){return driver.findElement(BttnLgn);}
}
