package tests;

import org.testng.annotations.Test;

public class HomeTest extends Base {
    @Test
    public void loginStd(){
        pageFactory.getLoginPage().login(prop.getProperty("uname1"), prop.getProperty("pass"));
    }

    @Test(dependsOnMethods = "loginStd")
    public void checkingFilter(){
        pageFactory.getHomePage().filterAtoZ();
        pageFactory.getHomePage().filterZtoA();
        pageFactory.getHomePage().filterZtoA();
        pageFactory.getHomePage().filterZtoA();
    }

    @Test (dependsOnMethods = "loginStd")
    public void checkPic(){
        pageFactory.getHomePage().setBagPackPic();
        driver.navigate().back();
        pageFactory.getHomePage().setBikeLightPic();
        driver.navigate().back();
        pageFactory.getHomePage().setJacketPic();
        driver.navigate().back();
        pageFactory.getHomePage().setOnesiePic();
        driver.navigate().back();
        pageFactory.getHomePage().settShirtPic();
        driver.navigate().back();
        pageFactory.getHomePage().settRedPic();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "loginStd")
    public void checkLink(){
        pageFactory.getHomePage().setBagPack();
        driver.navigate().back();
        pageFactory.getHomePage().setBikeLight();
        driver.navigate().back();
        pageFactory.getHomePage().setJacket();
        driver.navigate().back();
        pageFactory.getHomePage().setOnesie();
        driver.navigate().back();
        pageFactory.getHomePage().settShirt();
        driver.navigate().back();
        pageFactory.getHomePage().settRed();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "loginStd")
    public void checkCart(){
        pageFactory.getHomePage().setBagPackCart();
        pageFactory.getHomePage().setBikeLightCart();
        pageFactory.getHomePage().setJacketCart();
        pageFactory.getHomePage().setOnesieCart();
        pageFactory.getHomePage().settShirtCart();
        pageFactory.getHomePage().settRedCart();
    }

    @Test (dependsOnMethods = "loginStd")
    public void CheckingSocialMediaLinks() {
        pageFactory.getHomePage().setLinkedIn();
        pageFactory.getHomePage().setTwitter();
        pageFactory.getHomePage().setFacebook();
    }
}
