package tutorial.POM.pages._04_BuildPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    //Define elements (Button, textButtons, Links, Images etc.)

    private final By msg_footer = By.xpath("//div[@class='footer_copy']");



    //Methods (Click, fill value, mouse hover etc.)

    public WebElement get_Msg_footer() {
        return driver.findElement(msg_footer);
    }

}
