import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import FindersandClickers.ElementFinder;

public class DropdownAuto {
    WebDriver wd;
    ElementFinder ef;
    public DropdownAuto(WebDriver dr){
        wd = dr;
        ef = new ElementFinder(wd);
    }
    public void selectValueFromSortDD(String value) {
        String option;

        for(WebElement el: ef.classFinds("sortOptionText")){
            option = el.getText();
            option = option.strip();
            if(option.equalsIgnoreCase(value)){
                el.click();
            }
        }
    }
    public void selectValueFromMenuDD(String value) {
        String option;

        for(WebElement el: ef.xpathFinds("//ul[@id=\"menuNavigation\"]//li/a")){
            option = el.getText();
            option = option.strip();
            System.out.println(option);
            if(option.equalsIgnoreCase(value)){
                el.click();
            }
        }
    }
}
