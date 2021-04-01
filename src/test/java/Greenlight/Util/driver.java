package Greenlight.Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class driver {

    private driver(){}

    private static WebDriver driver;

    public static WebDriver driver() {
        if(driver == null) {
            WebDriverManager.chromedriver().setup();

            //For Headless Mode
            //ChromeOptions options = new ChromeOptions();
            //options.addArguments("--headless", "--disable-gpu", "--window-size=1920, 1080", "--ignore-certificate-errors", "--silent");
            //driver = new ChromeDriver(options);

            //For Visible UI Mode
            driver = new ChromeDriver();
        }
        return driver;
    }
}
