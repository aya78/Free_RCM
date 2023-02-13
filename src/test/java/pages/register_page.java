package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class register_page {
    private static WebElement element=null;

    // public int randomInt ;
    static WebDriver driver = null;
    public register_page(WebDriver driver) {
        this.driver = driver;
    }
    public static WebElement enter_email(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        return element;
    }
    // //*[@id="terms"]
    public static WebElement check_agree_on_terms(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"terms\"]"));
        return element;
    }
    // //span[@role='checkbox']//div
    public static WebElement check_not_robot(WebDriver driver){
        element = driver.findElement(By.xpath("//span[@role='checkbox']//div"));
        return element;
    }
    // /html/body/div[1]/div/div[2]/div[2]/form/div[4]/button
    public static WebElement click_sign_up(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/form/div[4]/button"));
        return element;
    }
    // /html/body/div[1]/div/a
    public static WebElement get_account_login_here(WebDriver driver){
        element = driver.findElement(By.xpath("/html/body/div[1]/div/a"));
        return element;
    }
}
