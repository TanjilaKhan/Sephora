import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Amazon extends Setup {


    @FindBy(id = "searchDropdownBox")
    WebElement search;

    @FindBy(id ="searchDropdownBox")
    WebElement searchText;


    void searchBar(){
        dropDown(search, 10);

    }
    void searchbar1(){
        searchText.isDisplayed();

    }
}
