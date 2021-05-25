package listeners;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestListenersDemo extends Base {

    @BeforeMethod
    public void setUp(){
        initialization();
    }

    @Test
    public void test() {
        test1();
        test2();
        test3();
    }

        @Test
    public void takeScreeshot(){
            Assert.assertEquals(false, true);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();
    }
}
