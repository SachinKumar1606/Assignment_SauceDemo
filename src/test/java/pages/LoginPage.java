package pages;

import junit.framework.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static tests.Base.driver;

public class LoginPage implements Interfaces.LoginPage {

    @FindBy(id = "user-name")
    private WebElement username;
    @FindBy (id="password")
    private WebElement password;
    @FindBy (id="login-button")
    private WebElement submit;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @Override
    public void login(String uName, String pass) {
        username.sendKeys(uName);
        password.sendKeys(pass);
        submit.click();
    }

    @Override
    public void validateLogin(String exp) {
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

}
