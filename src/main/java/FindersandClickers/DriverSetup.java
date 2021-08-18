package FindersandClickers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver d = new ChromeDriver();
        return d;
    }
}
