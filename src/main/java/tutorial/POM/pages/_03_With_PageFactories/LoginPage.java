package tutorial.POM.pages._03_With_PageFactories;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;

        //find by anotasyonu ile declare edilen değişkenleri initialize eder.
        PageFactory.initElements(driver,this);

    }

    //Define elemenets (Button, textButtons, Links, Images etc.)

    @FindBy(id="user-name")
    private WebElement textbox_username;

    @FindBy(id="password")
    private WebElement textbox_password;

    @FindBy(xpath="//input[@value='login']")
    private WebElement btn_Login;

    //    private final By textbox_username = By.id("user-name");
    //    private final By textbox_password = By.id("password");
    //    private final  By btn_Login = By.xpath("//*[@id=\"login-button\"]");



    //Methods (Click, fill value, mouse hover etc.)

    public void fill_Textbox_username(String username) {
        //driver.findElement(textbox_username).sendKeys(username);
        textbox_username.sendKeys(username);
    }


    public void fill_Textbox_password(String password) {
        //driver.findElement(textbox_password).sendKeys(password);
        textbox_password.sendKeys(password);
    }

    public void click_Btn_login () {

         //driver.findElement(btn_Login).click();
         btn_Login.click();
    }

}
