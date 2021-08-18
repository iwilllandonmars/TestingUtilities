import FindersandClickers.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import FindersandClickers.DriverSetup;
import FindersandClickers.ElementFinder;

import java.io.FileNotFoundException;

public class Apartments {
    static WebDriver driver = DriverSetup.getDriver();
    static Actions act = new Actions(driver);
    public static void main(String[] args) throws Exception {
        YAMLReader yr = new YAMLReader("test.yaml");
        System.out.println(yr.read("venudvds"));
        ElementFinder ef = new ElementFinder(driver);
        driver.get("http://www.apartments.com");
        WebElement searchbar = ef.idFind("quickSearchLookup");
        searchbar.sendKeys("Alpharetta, GA");
        act.sendKeys(Keys.ENTER).build().perform();
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }
        WebElement priceDD = ef.titleFind("Price");
        act.click(priceDD).build().perform();
        WebElement minrent = ef.idFind("min-input");
        minrent.sendKeys("1000");
        WebElement maxrent = ef.idFind("max-input");
        maxrent.sendKeys("1500");
        act.sendKeys(Keys.ENTER).build().perform();
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
        }
        ef.classFind("sortBtnTitle").click();
        DropdownAuto dA = new DropdownAuto(driver);
        dA.selectValueFromSortDD("Last Updated");
        ef.idFind("headerMenuLink").click();
        dA.selectValueFromMenuDD("Mobile Apps");
    }
}
