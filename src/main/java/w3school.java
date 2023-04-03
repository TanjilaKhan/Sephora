import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class w3school extends Setup{

    @FindBy(xpath = "//input[@id='fname']")
    WebElement firstname;

    void firstnamePage(){
        firstname.sendKeys("My First Name");

    }

    @FindBy(xpath = "//input[@id='lname']")
    WebElement lastname;

    void lastnamaePage(){
        lastname.sendKeys("last name");
    }

    @FindBy(xpath = "//input[@value='Submit']")
    WebElement submit;

    void submitPage(){
        submit.click();
    }
}
