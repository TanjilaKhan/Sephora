import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoqaTest extends Setup {

    Demoqa demoqa;

    @BeforeMethod
    void SetupTest() {
        setupDriver("https://demoqa.com/browser-windows");
        demoqa = PageFactory.initElements(driver, Demoqa.class);
    }

    @AfterMethod
    void close() throws InterruptedException {
        quitBrowser();
    }

    @Test
    void windowhandlingTest(){
        demoqa.presentTab();
        windowHandle(driver);
        Assert.assertTrue(demoqa.secondTabPage());
    }

    @Test
    void windowhandlingTest1(){
        demoqa.newWindowPage();
        windowHandle(driver);
        Assert.assertTrue(demoqa.secondTabPage());
    }



}
