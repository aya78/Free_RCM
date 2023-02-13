package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_page {
    private static WebElement element=null;

    // public int randomInt ;
    static WebDriver driver = null;
    public login_page(WebDriver driver) {
        this.driver = driver;
    }
    // //*[@id="ui"]/div/div/form/div/div[1]/div/input
    public static WebElement enter_email(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input"));
        return element;
    }
    // //*[@id="ui"]/div/div/form/div/div[2]/div/input
    public static WebElement enter_password(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input"));
        return element;
    }
    // //*[@id="ui"]/div/div/form/div/div[3]

    public static WebElement click_login(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
        return element;
    }

}
