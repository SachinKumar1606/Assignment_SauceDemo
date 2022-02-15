package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static tests.Base.*;

public class CheckOutTest extends Base{

    @Test
    public void loginStd(){
        pageFactory.getLoginPage().setUsername(prop.getProperty("uname1"));
        pageFactory.getLoginPage().setPassword(prop.getProperty("pass"));
        pageFactory.getLoginPage().setSubmit();
        String exp = prop.getProperty("loginPage");
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act,exp);
    }

    @Test(dependsOnMethods = "loginStd")
    public void checkPName1() throws InterruptedException {
        pageFactory.getHomePage().setBagPackCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getHomePage().setCart();
        pageFactory.getCartPage().setCheckout();
        pageFactory.getCheckOutPage().setfName(prop.getProperty("fname"));
        pageFactory.getCheckOutPage().setlName(prop.getProperty("lname"));
        pageFactory.getCheckOutPage().setPostCode(prop.getProperty("pin"));
        pageFactory.getCheckOutPage().setShop();
        driver.findElement(By.className(prop.getProperty("finish"))).click();
        String act = driver.findElement(By.className(prop.getProperty("lastTittle"))).getText();
        String exp = prop.getProperty("lMsg");
        Assert.assertEquals(act, exp);
        System.out.println("Final Test Executed Successfully");
    }
}
