import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SephoraPage extends Setup {

    @FindBy(xpath = "//div[@class='css-17rgt6']/div[2]/div[4]")
    WebElement basket;

    @FindBy(css = "[data-at='sign_in_header']")
    WebElement signin;

    @FindBy(xpath = "//*[@id=\"account_drop\"]/div[1]/div/div[1]/div/span")
    WebElement signinText;

    @FindBy(css = "[class='css-jlyw9s e65zztl0']")
    WebElement logo;

    @FindBy(id = "site_search_input")
    WebElement searchbar;

    @FindBy(xpath = "//a[@id='loves_drop_trigger']/div[1]")
    WebElement love;

    @FindBy(xpath = "//a[@id='community_drop_trigger']/span")
    WebElement comm;

    @FindBy(xpath = "//button[@aria-controls=\"stores_drop\"]/span")
    WebElement stores;

    @FindBy(css = "[class='css-f61fcm ChatLink-target']")
    WebElement help;

    @FindBy(xpath = "//a[@class='css-13lxfmz']/span")
    WebElement app;

    @FindBy(xpath = "//div[@class='css-19798u5 eanm77i0']/div/a[3]/span/strong")
    WebElement text;

    @FindBy(xpath = "//a[@id='top_nav_drop_0_trigger']")
    WebElement newnew;

    @FindBy(id = "top_nav_drop_1_trigger")
    WebElement brand;

    @FindBy(xpath = "//div[@data-at='footer_legal_section']/p[1]")
    WebElement copy;

    @FindBy(xpath = "//p[@class='css-1tk6fal eanm77i0']/a[1]")
    WebElement privacy;

    @FindBy(id = "top_nav_drop_2_trigger")
    WebElement make;

    @FindBy(xpath = "//a[@id='top_nav_drop_8_trigger']")
    WebElement mini;

    @FindBy(xpath = "//div[@id='homepage_slideshow_multi-world_slotting_marchminis_broadcast_us_rwd_banner_033123']")
    WebElement now;

    @FindBy(xpath = "//*[@id=\"homepage_productlist_ChosenForYou_us_rwd_092022\"]/div[2]/div/ul/li[3]/a/div[2]/div")
    WebElement clean;

    @FindBy(xpath = "//div[@id='homepage_marketingbanner2_color_brand-sku-launch_SC_FY232421_default_us_rwd_banner_033123']")
    WebElement makeupyourskin;

    @FindBy(xpath = "//div[@id='homepage_slideshow_multi-world_slotting_marchminis_broadcast_us_rwd_banner_033123']")
    WebElement musthave;

    @FindBy(xpath = "//ul[@id=\"footer_nav0\"]/li")
    List<WebElement> sistersSites;

    @FindBy(xpath = "//ul[@id=\"footer_nav1\"]/li")
    List<WebElement> beutysisterSites;

    @FindBy(xpath = "//ul[@id='footer_nav2']/li")
    List<WebElement> customerSistersites;

    @FindBy(xpath = "//nav[@class='css-1e0yu9s']/div")
    List<WebElement> header;

    @FindBy(xpath = "//img[@alt='Instagram']")
    WebElement ins;

    @FindBy(xpath = "//div[@data-at='footer_legal_section']/p[1]")
    WebElement rights;

    @FindBy(xpath = "//button[@id='top_nav_drop_11_trigger']")
    WebElement saleoffer;

    @FindBy(xpath = "//ul[@aria-labelledby=\"footer_nav_heading0\"]/li")
    List<WebElement> footeraboutsephora;

    @FindBy(xpath = "//a[@id='top_nav_drop_5_trigger']")
    List<WebElement> fragrance;

    @FindBy(xpath = "//input[@autocomplete='email']")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"clarip-do-not-sell-link\"]")
    WebElement choices;

    @FindBy(xpath = "//body[@class='css-dpgvap']")
    WebElement homepage;

    @FindBy(xpath = "//a[@id='top_nav_drop_4_trigger']")
    WebElement hair;

    @FindBy(xpath = "//div[@id='homepage_productlist_ChosenForYou_us_rwd_092022']/div[1]/h2")
    WebElement sephoracollection;

    @FindBy(xpath = "//div[@id='homepage_productlist_JustDropped_us_rwd_092022']/div[1]/h2")
    WebElement justdropped;



    void basketSign() {
        basket.click();
    }

    void signIn() {
        signin.click();
    }

    String signInText(){
        return signinText.getText();
    }

    boolean sephoralogo() {
        return logo.isDisplayed();
    }

    void searchBar() {
        searchbar.sendKeys("Lipstick");
    }

    void loveSign(){
        love.click();
    }

    void searcProduct(){
        searchbar.sendKeys("Eyeliner",Keys.ENTER);
    }

    boolean community() {
        return comm.isSelected();
    }

    void storesandservices() {
        stores.click();
    }

    boolean live() {
        return help.isEnabled();
    }

    boolean get() {
        return app.isDisplayed();
    }

    void alerttext() {
        text.click();
    }

    boolean newPage(WebDriver dr) {
        moveMouse(dr, newnew);
        boolean newpage = newnew.isDisplayed();
        return newpage;
    }

    void brandPage(WebDriver dr) {
        moveMouse(dr, brand);
        brand.click();
    }

    String copyRight(WebDriver dr) {
        moveMouse(dr, copy);
        return copy.getText();
    }

    boolean policy(WebDriver dr) {
        moveMouse(dr, privacy);
        boolean text = privacy.isDisplayed();
        return text;
    }

    void makeup(WebDriver dr) {
        moveMouse(dr, make);
        make.isEnabled();
    }

    void complementary() {
        mini.click();

    }

    void shop(WebDriver dr) {
        doubleClick(dr, now);
    }

    void eye(WebDriver dr) {
        doubleClick(dr, clean);
    }

    void makeupYourSkinlink(WebDriver dr) {
        doubleClick(dr, makeupyourskin);
    }

    void musthaveminis(WebDriver dr){
        doubleClick(dr,musthave);
    }

    ArrayList<String> linkText() {
        ArrayList<String> text = new ArrayList<>();

        for (WebElement a : sistersSites) {
            text.add(a.getText());
        }

        return text;
    }

    ArrayList<String> headerText() {
        ArrayList<String> top = new ArrayList<>();

        for (WebElement h : header) {
            top.add(h.getText());
        }

        return top;
    }

    ArrayList<String> beutyLinks() {
        ArrayList<String> beuty = new ArrayList<>();

        for (WebElement b : beutysisterSites) {
            beuty.add(b.getText());
        }
        return beuty;
    }

    ArrayList<String> customerService() {
        ArrayList<String> service = new ArrayList<>();

        for (WebElement s : customerSistersites) {
            service.add(s.getText());
        }
        return service;
    }

    boolean instraPage() {
        return ins.isDisplayed();
    }

    boolean allrights() {
         return rights.isDisplayed();
    }

    void saleoffers(){
        saleoffer.click();
    }

    String salesanadofferPage(WebDriver dr){
       moveMouse(dr,saleoffer);
      // driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
       return saleoffer.getText();
    }

    ArrayList<String> fragranceList(){
        //moveMouse(driver,WebElement fragrance);
        ArrayList<String> list = new ArrayList<>();

        for(WebElement frag : fragrance){
            list.add(frag.getText());
        }

        return list;
    }

    ArrayList<String> footerAboutSephora(){
        ArrayList<String> about = new ArrayList<>();

        for(WebElement f : footeraboutsephora){
            about.add(f.getText());
        }
        return about;
    }

    void enterEmail(){
        email.sendKeys("xyz@yahoo.com");
    }

    boolean yourPrivacy() {
        return privacy.isDisplayed();
    }


    void hairPage(){
        hair.click();
    }

    boolean sephoraCollection(){
        return sephoracollection.isDisplayed();
    }

    boolean justDropped(){
        return justdropped.isEnabled();
    }

    boolean alertPopUp(){
        return homepage.isDisplayed();
    }






}





