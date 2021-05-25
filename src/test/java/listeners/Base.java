package listeners;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;

import java.io.File;
import java.io.IOException;

public class Base {
    static WebDriver driver;

    public void initialization() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Chrome Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void test1() {
        System.out.println("I am Inside test 1");

        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("patilsharad2000@gmail.com");
        driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Sharad@1998");
        driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
    }

    public void test2(){
        System.out.println("I am Inside test 2");

        driver.get("https://www.linkedin.com/signup/cold-join?trk=guest_homepage-basic_nav-header-join");
        driver.findElement(By.id("//*[@id='email-or-phone']")).sendKeys("9096549959");
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Sharad@1234");
        driver.findElement(By.xpath("//*[@id='join-form-submit']")).click();
    }

    public void test3(){
        System.out.println("I am Inside test 3");
        throw new SkipException("This test is skipped");
    }

    public void testFailed_screenshot() throws IOException {
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\Admin\\IdeaProjects\\Selenium_firstproject\\src\\test\\resources\\ScreenShot"));

    }
}
