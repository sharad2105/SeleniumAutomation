import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjectmodule.Linkedinpage;
public class pages{
    private static WebDriver driver = null;
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Chrome Driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");

            Linkedinpage.user_name(driver).sendKeys("patilsharad2000@gmail.com");
            Linkedinpage.password(driver).sendKeys("Sharad@1998");
            Linkedinpage.signin(driver).click();

        }
    }
