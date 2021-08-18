package FindersandClickers;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;


public class ElementFinder {
    WebDriver driver;
    public ElementFinder(WebDriver driver){
        this.driver = driver;

    }
    public WebElement idFind(String id){
        WebElement webE = driver.findElement(By.id(id));
        return webE;
    }
    public ArrayList<WebElement> idFinds(String id){
        List<WebElement> webE = driver.findElements(By.id(id));
        return (ArrayList<WebElement>) webE;
    }
    public WebElement classFind(String clas){
        WebElement webE = driver.findElement(By.className(clas));
        return webE;
    }
    public ArrayList<WebElement> classFinds(String clas){
        List<WebElement> webE = driver.findElements(By.className(clas));
        return (ArrayList<WebElement>) webE;
    }
    public WebElement titleFind(String title){
        WebElement webE = driver.findElement(By.xpath("//*[@title='"+title+"']"));
        return webE;
    }
    public WebElement textFind(String text){
        WebElement webE = driver.findElement(By.xpath("//*[text()='"+text+"']"));
        return webE;
    }
    public ArrayList<WebElement> xpathFinds(String xpath){
        List<WebElement> webE = driver.findElements(By.xpath(xpath));
        return (ArrayList<WebElement>) webE;
    }
    public WebElement xpathFind(String xpath){
        WebElement webE = driver.findElement(By.xpath(xpath));
        return webE;
    }
}
