package pageobjectmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Linkedinpage {
    private static WebElement element = null;

    public static WebElement user_name(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id = 'username']"));
        return element;
    }

    public static  WebElement password (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id = 'password']"));
        return element;
    }

    public static WebElement signin (WebDriver driver){
       element =  driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button"));
       return element;
    }
}
