package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class home_page {
    private static WebElement element=null;

    // public int randomInt ;
    static WebDriver driver = null;
    public home_page(WebDriver driver) {
        this.driver = driver;
    }
    public static WebElement click_on_register(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[1]/a"));
        return element;
    }
    public static WebElement clickOn_login(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@id=\"navbar-collapse\"]/ul/li[2]/a"));
        return element;
    }
}
