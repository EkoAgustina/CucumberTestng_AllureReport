import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static Utils.chromeBrowser.driver;
@Test
public class test {
    public void ya (){
          driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
}
}
