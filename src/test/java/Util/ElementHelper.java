package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ElementHelper {
    public static WebDriver driver;
    public static WebElement element;
    public boolean genericClick(WebDriver driver, WebElement elementToBeClicked)
    {

        try{

            elementToBeClicked.click();

            return true;
        }
        catch(Exception e){

            return false;
        }

    }
    public void doubleClick(WebDriver driver, WebElement element){
        Actions actions = new Actions(driver);
        actions.doubleClick(element).perform();
    }

}
