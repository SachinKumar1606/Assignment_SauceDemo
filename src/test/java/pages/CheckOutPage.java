package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Iterator;
import java.util.Set;

import static tests.Base.driver;
import static tests.Base.prop;

public class CheckOutPage implements Interfaces.CheckOutPage {

    @FindBy(id="react-burger-menu-btn")
    private WebElement menu;
    @FindBy(id="inventory_sidebar_link")
    private WebElement allItem;
    @FindBy(id="about_sidebar_link")
    private WebElement about;
    @FindBy(id="logout_sidebar_link")
    private WebElement logout;
    @FindBy(id = "reset_sidebar_link")
    private WebElement resetApp;
    @FindBy(id = "react-burger-cross-btn")
    private WebElement close;
    @FindBy(className = "shopping_cart_link")
    WebElement cart;

    @FindBy(id = "first-name")
    private WebElement fName;
    @FindBy(id = "last-name")
    private WebElement lName;
    @FindBy(id = "postal-code")
    private WebElement postCode;

    @FindBy(id = "cancel")
    private WebElement cancel;
    @FindBy(id = "continue")
    private WebElement shop;

    //Locators of social media sites
    @FindBy(partialLinkText="Twitter")
    private WebElement twitter;
    @FindBy(partialLinkText="Facebook")
    private WebElement facebook;
    @FindBy(partialLinkText="LinkedIn")
    private WebElement linkedIn;

    public CheckOutPage(){
        PageFactory.initElements(driver, this);
    }

    public void setCancel(){
        cancel.click();
    }

    public void setShop() {
        shop.click();
    }

    public void purchase(String fname, String lname, String pin){
        fName.sendKeys(fname);
        lName.sendKeys(lname);
        postCode.sendKeys(pin);
    }

    //Link check if social media accounts.
    public void setTwitter() {
        twitter.click();
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1 = s.iterator();
        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                String act = driver.switchTo().window(child_window).getCurrentUrl();
                driver.switchTo().window(parent);
            }
        }
        String exp = prop.getProperty("twitter");
    }

    public void setFacebook() {
        facebook.click();
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1 = s.iterator();
        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                String act = driver.switchTo().window(child_window).getCurrentUrl();
                driver.switchTo().window(parent);
            }
        }
        String exp = prop.getProperty("facebook");
    }

    public void setLinkedIn() {
        linkedIn.click();
        String parent = driver.getWindowHandle();
        Set<String> s = driver.getWindowHandles();
        // Now iterate using Iterator
        Iterator<String> I1 = s.iterator();
        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                String act = driver.switchTo().window(child_window).getCurrentUrl();
                driver.switchTo().window(parent);
            }
        }
        String exp = prop.getProperty("linkedIn");
    }
}
