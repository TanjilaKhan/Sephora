import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonTest  extends Setup{

    Amazon amazon;

    @BeforeMethod
    void SetupTest(){
        setupDriver("https://amazon.com");
        amazon = PageFactory.initElements(driver, Amazon.class);
    }

    @AfterMethod
    void close() throws InterruptedException {
        quitBrowser();
    }


    @Test
    void validateSearchbar(){
        amazon.searchBar();
    }

    @Test
    void validateSearchbar1() throws InterruptedException {
        Thread.sleep(3000);
        amazon.searchbar1();
    }

    @Test
    void ScrollDown(){
        ScrollDownMethod(driver,"window.scroll(0,10000)");
        String actualUrl = driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
}
