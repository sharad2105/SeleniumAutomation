import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupWindow {
    static WebDriver driver;

    @BeforeMethod
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void poupVerification(){

        driver.get("http://admin:admin@hthe-internet.herokuapp.com/basic_auth");
        String text = driver.findElement(By.cssSelector("p")).getText();
        System.out.println(text);
    }
}
