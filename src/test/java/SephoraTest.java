import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class SephoraTest extends Setup{

    SephoraPage sephora;

    @BeforeMethod
    void SetupTest() {
        setupDriver("https://sephora.com");
        sephora = PageFactory.initElements(driver, SephoraPage.class);
    }

    @AfterMethod
    void Close() throws InterruptedException {
        quitBrowser();
    }

   @Test
   void basketTest(){
        sephora.basketSign();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.sephora.com/");
    }
    @Test
    void signinTest(){
        sephora.signIn();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.sephora.com/");
    }

    @Test
    void signInTextvalidation(){
        sephora.signIn();
        String actual = sephora.signInText();
        Assert.assertTrue(actual.contains("Beautiful"));
    }

    @Test
    void sephoralogoTest(){
        Assert.assertTrue(sephora.sephoralogo());
    }

    @Test
    void SearchBarTest(){
        sephora.searchBar();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.sephora.com/");
    }

    @Test
    void SearchProduct(){
        sephora.searcProduct();
        String actualurl = driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        Assert.assertEquals(actualurl,"https://www.sephora.com/");
    }

    @Test
    void loveSignTest() throws InterruptedException {
        Thread.sleep(3000);
        sephora.loveSign();
        String actualurl = driver.getCurrentUrl();
        Assert.assertEquals(actualurl,"https://www.sephora.com/");
    }

    @Test
    void communityValidate(){
        Assert.assertFalse(sephora.community());
    }

    @Test
    void storesTest(){
        sephora.storesandservices();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.sephora.com/");
    }

    @Test
    void livehelp(){
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        Assert.assertTrue(sephora.live());
    }

    @Test
    void getApp() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(sephora.get());
    }

    @Test
    void testAllertvalidate(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        sephora.alerttext();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.sephora.com/beauty/text-alerts");
    }
    @Test
    void newTest(){
       boolean a = sephora.newPage(driver);
        Assert.assertTrue(a);
    }

    @Test
    void brandTest(){
        sephora.brandPage(driver);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.sephora.com/brands-list");
    }

    @Test
    void copyRightTest(){
        Assert.assertEquals(sephora.copyRight(driver),"© 2023 Sephora USA, Inc. All rights reserved.");
        System.out.println(sephora.copyRight(driver));
    }

    @Test
    void privacyPolicy(){
        Assert.assertTrue(sephora.policy(driver));
        System.out.println(sephora.policy(driver));
    }

    @Test
    void makeUp(){
        sephora.makeup(driver);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.sephora.com/");
    }

    @Test
    void complementaryFragrance() throws InterruptedException {
        sephora.complementary();
        Thread.sleep(3000);
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.sephora.com/");
    }

    @Test
    void shopNow() throws InterruptedException {
        Thread.sleep(3000);
        sephora.shop(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("homepage_slideshow_multi-world_slo"));
    }

    @Test
    void eyeMusk(){
        sephora.eye(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("P460856?icid2"));
    }

    @Test
    void MakeupYourSkinLinkTest() throws InterruptedException {
        Thread.sleep(3000);
        sephora.makeupYourSkinlink(driver);
        Assert.assertTrue(driver.getCurrentUrl().contains("-P467140?icid2"));
    }
    @Test
    void musthaveMinis() throws InterruptedException {
       Thread.sleep(3000);
       sephora.musthaveminis(driver);
       String actualurl = driver.getCurrentUrl();
       Assert.assertEquals(actualurl,"https://www.sephora.com/shop/travel-size-toiletries?icid2=homepage_slideshow_multi-world_slotting_marchminis_broadcast_us_rwd_banner_033123");
    }

    @Test
    void validateNumberofLinks() throws InterruptedException {
        Thread.sleep(3000);
        int number = sephora.linkText().size();
        Assert.assertEquals(number,13);
    }

    @Test
    void beutyLinksTest(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        int number =sephora.beutyLinks().size();
        Assert.assertEquals(number,12);
    }

    @Test
    void customerServiceLinks() throws InterruptedException {
        int number = sephora.customerService().size();
        Thread.sleep(2000);
        Assert.assertEquals(number,12);
        System.out.println(sephora.customerService());
    }

    @Test
    void validateHeader(){
        int number = sephora.headerText().size();
        Assert.assertEquals(number,12);
        System.out.println(sephora.headerText());
    }

    @Test
    void headerLinks(){
        ArrayList<String> links = sephora.headerText();
        Assert.assertTrue(links.contains("New"));
        System.out.println(links);
    }

    @Test
    void brandsLinks(){
        ArrayList<String> blink = sephora.headerText();
        Assert.assertTrue(blink.contains("Brands"));
        System.out.println(blink);
    }

    @Test
    void instagram() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(sephora.instraPage());

    }

    @Test
    void allrightsreserved() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(sephora.allrights());
    }

    @Test
    void saleandoffer(){
        sephora.saleoffers();
        String actualurl = driver.getCurrentUrl();
        Assert.assertEquals(actualurl,"https://www.sephora.com/");
    }

    @Test
    void validateSaleandOffer(){
        Assert.assertEquals(sephora.salesanadofferPage(driver),"Sale & Offers");
        System.out.println(sephora.salesanadofferPage(driver));
    }


    @Test
    void fragranceTest(){
        int number = sephora.fragranceList().size();
        Assert.assertEquals(number,1);
        System.out.println(sephora.fragranceList());
    }

    @Test
    void FooterAboutSephoraTest() throws InterruptedException {
        Thread.sleep(2000);
        int number = sephora.footerAboutSephora().size();
        Thread.sleep(2000);
        Assert.assertEquals(number, 13);
        System.out.println(sephora.footerAboutSephora());
    }

    @Test
    void enterEmailTest(){
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        sephora.enterEmail();
        String actualurl = driver.getCurrentUrl();
        Assert.assertEquals(actualurl,"https://www.sephora.com/");
    }

    @Test
    void PrivacyTest(){
        Assert.assertTrue(sephora.yourPrivacy());
        System.out.println(sephora.yourPrivacy());
    }

    @Test
    void ScrollDown(){
        ScrollDownMethod(driver, "window.scroll(0,8000)");
        String actualUrl = driver.getCurrentUrl();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    void hairTest() throws InterruptedException {
        try {
            Thread.sleep(3000);
            sephora.hairPage();
            String actualurl = driver.getCurrentUrl();
            Assert.assertEquals(actualurl,"https://www.sephora.com/");
        } catch (InterruptedException e) {
            System.out.println("Nothing Shows");
            throw new RuntimeException(e);
        }

    }

    @Test
    void sephoraCollectionTest(){
        try {
            boolean b = sephora.sephoraCollection();
            driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
            Assert.assertTrue(b);
            System.out.println("Sephora Collection visible");
        } catch (Exception e) {
            System.out.println("Nothing Shows");
            throw new RuntimeException(e);
        }
    }

    @Test
    void headerListTest(){
        ArrayList<String> expected = new ArrayList<>();
        expected.add("New");
        expected.add("Brands");
        expected.add("Makeup");
        expected.add("Skincare");
        expected.add("Hair");
        expected.add("Fragrance");
        expected.add("Tools & Brushes");
        expected.add("Bath & Body");
        expected.add("Mini Size");
        expected.add("Gifts");
        expected.add("Beauty Under $20");
        expected.add("Sale & Offers");

        ArrayList<String> actual = sephora.headerText();

        Assert.assertEquals(actual,expected);
    }

    @Test
    void justDroppedTest() {
        boolean b = sephora.justDropped();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        System.out.println(sephora.justDropped());
        Assert.assertTrue(b);
    }

    @Test
    void alertPopup() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(sephora.alertPopUp());
    }


}
