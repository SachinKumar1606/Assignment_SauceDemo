package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Base {
    @Test
    public void loginStd(){
        pageFactory.getLoginPage().setUsername(prop.getProperty("uname1"));
        pageFactory.getLoginPage().setPassword(prop.getProperty("pass"));
        pageFactory.getLoginPage().setSubmit();
        String exp = prop.getProperty("loginPage");
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act,exp);
        driver.navigate().back();
    }

    @Test
    public void loginPro(){
        pageFactory.getLoginPage().setUsername(prop.getProperty("uname2"));
        pageFactory.getLoginPage().setPassword(prop.getProperty("pass"));
        pageFactory.getLoginPage().setSubmit();
        String exp = prop.getProperty("loginPage");
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act,exp);
        driver.navigate().back();
    }

    @Test
    public void loginGlitch(){
        pageFactory.getLoginPage().setUsername(prop.getProperty("uname3"));
        pageFactory.getLoginPage().setPassword(prop.getProperty("pass"));
        pageFactory.getLoginPage().setSubmit();
        String exp = prop.getProperty("loginPage");
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act,exp);
        driver.navigate().back();
    }

    @Test
    public void loginLock(){
        pageFactory.getLoginPage().setUsername(prop.getProperty("uname4"));
        pageFactory.getLoginPage().setPassword(prop.getProperty("pass"));
        pageFactory.getLoginPage().setSubmit();
        String exp = prop.getProperty("url");
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act,exp);
        driver.navigate().refresh();
    }
}
