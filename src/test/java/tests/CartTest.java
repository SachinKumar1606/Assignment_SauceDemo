package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends Base{


    @Test
    public void login(){
//        pageFactory.getLoginPage().setUsername(prop.getProperty("uname1"));
//        pageFactory.getLoginPage().setPassword(prop.getProperty("pass"));
//        pageFactory.getLoginPage().setSubmit();
        String exp = prop.getProperty("loginPage");
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act,exp);
    }

    @Test (dependsOnMethods = "login")
    public void checkPName1() {
        pageFactory.getHomePage().setBagPackCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className(prop.getProperty("cartpath"))).getText();
        String exp = pageFactory.getFileReader().getData(1, 0, 0);
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "login")
    public void checkPName2(){
        pageFactory.getHomePage().setBikeLightCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className(prop.getProperty("cartpath"))).getText();
        String exp = pageFactory.getFileReader().getData(1, 1, 0);
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "login")
    public void checkPName4(){
        pageFactory.getHomePage().settShirtCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className(prop.getProperty("cartpath"))).getText();
        String exp = pageFactory.getFileReader().getData(1, 2, 0);
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "login")
    public void checkPName5(){
        pageFactory.getHomePage().setJacketCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className(prop.getProperty("cartpath"))).getText();
        String exp = pageFactory.getFileReader().getData(1, 3, 0);
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "login")
    public void checkPName6(){
        pageFactory.getHomePage().setOnesieCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setpName();
        String act = driver.findElement(By.className(prop.getProperty("cartpath"))).getText();
        String exp = pageFactory.getFileReader().getData(1, 5, 0);
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "login")
    public void checkRemove1() {
        pageFactory.getHomePage().setBagPackCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setRemove();
        pageFactory.getCartPage().setHome();
    }

    @Test (dependsOnMethods = "login")
    public void checkRemove2(){
        pageFactory.getHomePage().setBikeLightCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setRemove();
        pageFactory.getCartPage().setHome();
    }

    @Test (dependsOnMethods = "login")
    public void checkRemove3(){
        pageFactory.getHomePage().settRedCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setRemove();
        pageFactory.getCartPage().setHome();
    }

    @Test (dependsOnMethods = "login")
    public void checkRemove4(){
        pageFactory.getHomePage().settShirtCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setRemove();
        pageFactory.getCartPage().setHome();
    }

    @Test (dependsOnMethods = "login")
    public void checkRemove5(){
        pageFactory.getHomePage().setJacketCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setRemove();
        pageFactory.getCartPage().setHome();
    }

    @Test (dependsOnMethods = "login")
    public void checkRemove6(){
        pageFactory.getHomePage().setOnesieCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setRemove();
        pageFactory.getCartPage().setHome();
    }

    @Test (dependsOnMethods = "login")
    public void checkCart1() {
        pageFactory.getHomePage().setBagPackCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setCheckout();
        String exp = pageFactory.getFileReader().getData(1, 0, 2);
        String act = driver.findElement(By.className(prop.getProperty("title"))).getText();
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "login")
    public void checkCart(){
        pageFactory.getHomePage().setBikeLightCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setCheckout();
        String exp = pageFactory.getFileReader().getData(1, 1, 2);
        String act = driver.findElement(By.className(prop.getProperty("title"))).getText();
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "login")
    public void checkCart3(){
        pageFactory.getHomePage().settRedCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setCheckout();
        String exp = pageFactory.getFileReader().getData(1, 2, 2);
        String act = driver.findElement(By.className(prop.getProperty("title"))).getText();
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "login")
    public void checkCart4(){
        pageFactory.getHomePage().settShirtCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setCheckout();
        String exp = pageFactory.getFileReader().getData(1, 3, 2);
        String act = driver.findElement(By.className(prop.getProperty("title"))).getText();
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "login")
    public void checkCart5(){
        pageFactory.getHomePage().setJacketCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setCheckout();
        String exp = pageFactory.getFileReader().getData(1, 4, 2);
        String act = driver.findElement(By.className(prop.getProperty("title"))).getText();
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }

    @Test (dependsOnMethods = "login")
    public void checkCart6(){
        pageFactory.getHomePage().setOnesieCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setCheckout();
        String exp = pageFactory.getFileReader().getData(1, 5, 2);
        String act = driver.findElement(By.className(prop.getProperty("title"))).getText();
        Assert.assertEquals(act, exp);
        driver.navigate().back();
        pageFactory.getCartPage().setRemove();
        driver.navigate().back();
    }
}
