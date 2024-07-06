package tutorial.POM.pages._02_Without_PageFactories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Define elemenets (Button, textButtons, Links, Images etc.)

    private final By textbox_username = By.id("user-name");

    private final By textbox_password = By.id("password");

    private final  By btn_Login = By.xpath("//*[@id=\"login-button\"]");



    //Methods (Click, fill value, mouse hover etc.)

    public void fill_Textbox_username(String username) {
        driver.findElement(textbox_username).sendKeys(username);
    }

    public void fill_Textbox_password(String password) {
        driver.findElement(textbox_password).sendKeys(password);
    }

    public void click_Btn_login () {
        driver.findElement(btn_Login).click();
    }

}
