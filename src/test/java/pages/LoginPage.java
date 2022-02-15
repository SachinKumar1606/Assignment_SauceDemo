package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static tests.Base.driver;

public class LoginPage {
    @FindBy(id = "user-name")
    private WebElement username;
    @FindBy (id="password")
    private WebElement password;
    @FindBy (id="login-button")
    private WebElement submit;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String uName){
        username.sendKeys(uName);
    }

    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    public void setSubmit(){
        submit.click();
    }
}
