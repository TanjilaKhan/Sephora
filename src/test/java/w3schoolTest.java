import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class w3schoolTest extends Setup{

    w3school school;

    @BeforeMethod
    void SetupTest(){
        setupDriver("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        school = PageFactory.initElements(driver,w3school.class);
    }

    @AfterMethod
    void Close() throws InterruptedException {
        quitBrowser();
    }

    @Test
    void firstnameTest(){
        driver.switchTo().frame("iframeResult");
        school.firstnamePage();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
    }

    @Test
    void lastnameTest(){
        driver.switchTo().frame("iframeResult");
        school.firstnamePage();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
    }

    @Test
    void submitTest(){
        driver.switchTo().frame("iframeResult");
        school.submitPage();
        String actualurl = driver.getCurrentUrl();
        Assert.assertEquals(actualurl,"https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
    }


}
