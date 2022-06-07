package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;

public class chromeBrowser {


    public static WebDriver driver = new ChromeDriver();
    @Test

    public static void PathChrome(){
        File filePath = new File(System.getProperty("user.dir"));
        File chromeExe = new File(filePath, "/chromedirver.exe");

        System.getProperty("webdriver-chrome-driver", chromeExe.getAbsolutePath());


    }

}
