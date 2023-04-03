import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;

public class Setup {

    WebDriver driver;
    void setupDriver(String url){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    void quitBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    void moveMouse(WebDriver dr, WebElement element){
        Actions action = new Actions(dr);
        action.moveToElement(element).perform();
    }

    void doubleClick(WebDriver dr, WebElement element){
        Actions action = new Actions(dr);
        action.doubleClick(element).perform();

    }

    void dropDown(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);


    }
    void dropdown1(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    void windowHandle(WebDriver dr){
        Set<String> otherWindow = dr.getWindowHandles();
        String currentWindow = dr.getWindowHandle();

        for(String s : otherWindow){
            if( s != currentWindow){
                dr.switchTo().window(s);
            }
        }

    }


    void ScrollDownMethod(WebDriver dr, String script) {
        JavascriptExecutor js = ((JavascriptExecutor) dr);
        js.executeScript(script);
    }


}
