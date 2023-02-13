package test;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.home_page;
import pages.register_page;
import pages.login_page;

public class login_test {
    //    String random_number = RandomStringUtils.random(2, false, true);
//    String random_barcode = RandomStringUtils.random(8, false, true);
    String password = "Aya123456";
    public String random_string = RandomStringUtils.random(5, true, true);
    //    public String currentUrl;
    public WebDriver driver;
    @BeforeTest(description = "SetUp chrome driver")
    public void SetUp()
    {
        System.setProperty("webdriver.chrome.driver","/home/hash-pc-8/IdeaProjects/Gadawl/src/test/resources/chromedriver");
        driver=new ChromeDriver();
    }
    @Test(priority = 0)
    public void Login() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://freecrm.com/");
        home_page.click_on_register(driver).click();
        register_page.get_account_login_here(driver).click();
        login_page.enter_email(driver).sendKeys("moheyaya026@gmail.com");
        login_page.enter_password(driver).sendKeys(""+password);
        login_page.click_login(driver).click();
    }
}
