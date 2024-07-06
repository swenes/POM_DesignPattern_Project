package tutorial.POM.pages._03_With_PageFactories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;

        //find by anotasyonu ile declare edilen değişkenleri initialize eder.
        PageFactory.initElements(driver,this);
    }

    //Define elements (Button, textButtons, Links, Images etc.)

    @FindBy(xpath = "//div[@class='footer_copy']")
    private WebElement msg_footer;
    //private final By msg_footer = By.xpath("//div[@class='footer_copy']");



    //Methods (Click, fill value, mouse hover etc.)
    public WebElement get_Msg_footer() {
        //return driver.findElement(msg_footer);
        return msg_footer;
    }

}
