import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FB_Automate {
    static WebDriver driver;
    static  String currenturl = "";

    @BeforeMethod
    public void setUP() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @Test
    public  void  joinLinkedin() {
        driver.get("https://www.linkedin.com/home");
        driver.findElement(By.xpath("/html/body/nav/div/a[1]")).click();
    }
    @Test
    public void registration(){
        driver.get("https://www.linkedin.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join");
        driver.findElement(By.id("//*[@id=\"email-or-phone\"]")).sendKeys("9096549959");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Sharad@1234");
        driver.findElement(By.xpath("//*[@id=\"join-form-submit\"]")).click();
    }


    @Test
    public void loginTest() {
        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("patilsharad2000@gmail.com");
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Sharad@1998");
        driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
       currenturl = driver.getCurrentUrl();

    }
}


