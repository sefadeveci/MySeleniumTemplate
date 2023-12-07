package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HelperClass {
    private static HelperClass helperClass;

    public static WebDriver driver;
    public final static int TIMEOUT = 10;
    static ConfigFileReader configFileReader;

    private HelperClass() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
        configFileReader= new ConfigFileReader();
    }

    public static void openPage() {
        driver.get(configFileReader.getUrl());
        //driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {

        if (helperClass==null) {

            helperClass = new HelperClass();
        }
    }

    public static void tearDown() {

        if(driver!=null) {
            driver.close();
            driver.quit();
        }

        helperClass = null;
    }
}
