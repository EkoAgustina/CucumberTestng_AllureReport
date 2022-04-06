package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginValidAkun {

    public WebDriver driver;
    public loginValidAkun (WebDriver driver){
        this.driver=driver;

    }

    @FindBy(how = How.XPATH, using = "//input[@id='user-name']") WebElement Username;
    @FindBy(how = How.XPATH, using = "//input[@id='password']") WebElement Password;
    @FindBy(how = How.XPATH, using = "//input[@id='login-button']") WebElement ButtonLogin;


//    By Usrnm = By.xpath("//input[@id='user-name']");
//    By Psswrd = By.xpath("//input[@id='password']");
//    By BttnLgn = By.xpath("//input[@id='login-button']");



    public void InputUsername(String usrnm){
        Username.sendKeys(usrnm);
    }

    public void InputPassword(String psswrd){
        Password.sendKeys(psswrd);
    }

    public void ClickButton(){
        ButtonLogin.click();
    }

//    public WebElement InputUsername(){return driver.findElement(Usrnm);}
//    public WebElement InputPassword(){return driver.findElement(Psswrd);}
//    public WebElement ClickButtonLogin(){return driver.findElement(BttnLgn);}
}
