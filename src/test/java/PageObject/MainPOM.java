package PageObject;

import Util.ElementHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MainPOM {
   private WebDriver driver;
   ElementHelper elementHelper;
    public MainPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        this.elementHelper=new ElementHelper();
    }
    @FindBy(how = How.ID, using = "APjFqb")
    private WebElement searchButton;


    public void clickSearch(){
        //searchButton.click();
        elementHelper.genericClick(driver,searchButton);
    }
    public void enterSearchKey(){
        searchButton.sendKeys("TestSendKey");
    }
    public void clickSearchButton() {
        searchButton.sendKeys(Keys.ENTER);

    }
    public void mainWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
}
