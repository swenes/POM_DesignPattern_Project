package tutorial.POM.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tutorial.POM.pages._02_Without_PageFactories.HomePage;
import tutorial.POM.pages._02_Without_PageFactories.LoginPage;

public class Test_03_Login_POM_With_PageFactories {

    private static final Logger log = LoggerFactory.getLogger(Test_03_Login_POM_With_PageFactories.class);
    WebDriver driver;

    //Open browser and navigate to website
    @BeforeMethod // Bu her method çalıştırılmadan önce devreye girmesini sağlayan bir anotasyondur.
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    //Fill the credentials
    //Click on the login button
    //Validate the msg on footer
    @Test
    public void test_Login_Functionality_Valid_Credentials(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.fill_Textbox_username("standard_user");
        loginPage.fill_Textbox_password("secret_sauce");
        loginPage.click_Btn_login();

        HomePage homePage = new HomePage(driver);
        String actual_msg = homePage.get_Msg_footer().getText();
        String expected_msg = " Sauce Labs. All Rights Reserved. Terms of Service | Privacy Policy";

        Assert.assertTrue(actual_msg.contains(expected_msg));
    }


    //Close browser
    @AfterMethod// Bu ise her method çalıştırıldıktan sonra devreye girecek bir anotasyondur.
    public void teardown(){
        driver.quit();
    }
}
