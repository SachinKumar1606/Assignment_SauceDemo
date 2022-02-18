package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.Base.*;

public class CheckOutTest extends Base{

    @Test
    public void loginStd(){
        pageFactory.getLoginPage().login(prop.getProperty("uname1"), prop.getProperty("pass"));
    }

    @Test(dependsOnMethods = "loginStd")
    public void checkPName1() throws InterruptedException {
        pageFactory.getHomePage().setBagPackCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setCheckout();
        pageFactory.getCheckOutPage().purchase(prop.getProperty("fname"), prop.getProperty("lname"), prop.getProperty("pin"));
        pageFactory.getCheckOutPage().setShop();
        driver.findElement(By.className(prop.getProperty("finish"))).click();
        String act = driver.findElement(By.className(prop.getProperty("lastTittle"))).getText();
        String exp = prop.getProperty("lMsg");
        Assert.assertEquals(act, exp);
        System.out.println("Final Test Executed Successfully");
    }
}
