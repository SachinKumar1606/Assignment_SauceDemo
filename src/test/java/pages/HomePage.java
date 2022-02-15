package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import tests.Base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import static java.time.Duration.ofSeconds;
import static tests.Base.*;

public class HomePage {

    //locators of filters

    @FindBy(className = "inventory_item_name")
    private WebElement pName;
    @FindBy(className = "product_sort_container")
    private WebElement filter;
    @FindBy(xpath = "//option[@value='az']")
    private WebElement filter1;
    @FindBy(xpath = "//option[@value='za']")
    private WebElement filter2;
    @FindBy(xpath = "//option[@value='lohi']")
    private WebElement filter3;
    @FindBy(xpath = "//option[@value='hilo']")
    private WebElement filter4;

    //locators of links text()

    @FindBy(partialLinkText = "Sauce Labs Backpack")
    private WebElement bagPack;
    @FindBy(partialLinkText = "Sauce Labs Bike Light")
    private WebElement bikeLight;
    @FindBy(partialLinkText = "Sauce Labs Bolt T-Shirt")
    private WebElement tShirt;
    @FindBy(partialLinkText = "Sauce Labs Fleece Jacket")
    private WebElement jacket;
    @FindBy(partialLinkText = "Sauce Labs Onesie")
    private WebElement onesie;
    @FindBy(partialLinkText = "Test.allTheThings() T-Shirt (Red)")
    private WebElement tRed;

    //Locators of social media sites

    @FindBy(partialLinkText = "Twitter")
    private WebElement twitter;
    @FindBy(partialLinkText = "Facebook")
    private WebElement facebook;
    @FindBy(partialLinkText = "LinkedIn")
    private WebElement linkedIn;

    //Locators of cart

    @FindBy(className = "shopping_cart_link")
    WebElement cart;

    //Locators of menu button and there links

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menu;
    @FindBy(id = "logout_sidebar_link")
    private WebElement allItem;
    @FindBy(id = "logout_sidebar_link")
    private WebElement logout;
    @FindBy(partialLinkText = "Reset App State")
    private WebElement resetApp;

    //Locators of images of products

    @FindBy(id = "item_4_img_link")
    private WebElement bagPackPic;
    @FindBy(xpath = "//a[@id='item_0_img_link']")
    private WebElement bikeLightPic;
    @FindBy(id = "item_1_img_link")
    private WebElement tShirtPic;
    @FindBy(id = "item_5_img_link")
    private WebElement jacketPic;
    @FindBy(id = "item_2_img_link")
    private WebElement onesiePic;
    @FindBy(id = "item_3_img_link")
    private WebElement jactRedPicketPic;

    //Locators add to cart

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement bagPackCart;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement bikeLightCart;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement tShirtCart;
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement jacketCart;
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    private WebElement onesieCart;
    @FindBy(id = "add-to-cart-test.allthethings()-t-shirt-(red)")
    private WebElement tRedCart;

    //Locators add to cartRemove

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement bagPackRemove;
    @FindBy(id = "remove-sauce-labs-bike-light")
    private WebElement bikeLightRemove;
    @FindBy(id = "remove-sauce-labs-bolt-t-shirt")
    private WebElement tShirtRemove;
    @FindBy(id = "remove-sauce-labs-fleece-jacket")
    private WebElement jacketRemove;
    @FindBy(id = "remove-sauce-labs-onesie")
    private WebElement onesieRemove;
    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    private WebElement tRedRemove;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    //functions for changing the filter

    public void changeFilter1() {
        filter.click();
        filter1.click();
    }

    public void changeFilter2() {
        filter.click();
        filter2.click();
    }

    public void changeFilter3() {
        filter.click();
        filter3.click();
    }

    public void changeFilter4() {
        filter.click();
        filter4.click();
    }

//    function for verifying the filter

    public void filterAtoZ() {
        System.out.println("Checking filter A to Z.");
        changeFilter1();
        ArrayList<WebElement> elements = (ArrayList<WebElement>) driver.findElements(By.className("inventory_item_name"));
        for (int i = 0; i < elements.size(); i++) {
            int a = i + 1;
            System.out.println("Filter " + a + " Checking.....");
            String act = elements.get(i).getText();
            String exp = pageFactory.getFileReader().getData(0, i, 0);
            Assert.assertEquals(act, exp);
            System.out.println("Filter " + a + " Checked.....");
        }
    }

    public void filterZtoA() {
        System.out.println("Checking filter Z to A.");
        changeFilter2();
        ArrayList<WebElement> elements = (ArrayList<WebElement>) driver.findElements(By.className("inventory_item_name"));
        for (int i = 0; i < elements.size(); i++) {
            int a = i + 1;
            System.out.println("Filter " + a + " Checking.....");
            String act = elements.get(i).getText();
            String exp = pageFactory.getFileReader().getData(0, i, 1);
            Assert.assertEquals(act, exp);
            System.out.println("Filter " + a + " Checked.....");
        }
    }

    public void filterLtoH() {
        System.out.println("Checking filter Low to High.");
        changeFilter3();
        ArrayList<WebElement> elements = (ArrayList<WebElement>) driver.findElements(By.className("inventory_item_name"));
        for (int i = 0; i < elements.size(); i++) {
            int a = i + 1;
            System.out.println("Filter " + a + " Checking.....");
            String act = elements.get(i).getText();
            String exp = pageFactory.getFileReader().getData(0, i, 2);
            Assert.assertEquals(act, exp);
            System.out.println("Filter " + a + " Checked.....");
        }
    }

    public void filterHtoL() {
        System.out.println("Checking filter High to Low.");
        changeFilter3();
        ArrayList<WebElement> elements = (ArrayList<WebElement>) driver.findElements(By.className("inventory_item_name"));
        for (int i = 0; i < elements.size(); i++) {
            int a = i + 1;
            System.out.println("Filter " + a + " Checking.....");
            String act = elements.get(i).getText();
            String exp = pageFactory.getFileReader().getData(0, i, 3);
            Assert.assertEquals(act, exp);
            System.out.println("Filter " + a + " Checked.....");
        }
    }

    public void setCart() {
        cart.click();
    }

    public void setBagPack() {
        bagPack.click();
        String exp = pageFactory.getFileReader().getData(1, 0, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void setBikeLight() {
        bikeLight.click();
        String exp = pageFactory.getFileReader().getData(1, 1, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void settShirt() {
        tShirt.click();
        String exp = pageFactory.getFileReader().getData(1, 2, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void setJacket() {
        jacket.click();
        String exp = pageFactory.getFileReader().getData(1, 3, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void settRed() {
        tRed.click();
        String exp = pageFactory.getFileReader().getData(1, 4, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);;
    }

    public void setOnesie() {
        onesie.click();
        String exp = pageFactory.getFileReader().getData(1, 5, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    //Logout method
    public void setLogout() {
        menu.click();
        driver.manage().timeouts().implicitlyWait(ofSeconds(10));
        logout.click();
    }

    //Picture check function
    public void setBagPackPic() {
        bagPackPic.click();
        String exp = pageFactory.getFileReader().getData(1, 0, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void setBikeLightPic() {
        bikeLightPic.click();
        String exp = pageFactory.getFileReader().getData(1, 1, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void settShirtPic() {
        tShirtPic.click();
        String exp = pageFactory.getFileReader().getData(1, 2, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void setJacketPic() {
        jacketPic.click();
        String exp = pageFactory.getFileReader().getData(1, 3, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void settRedPic() {
        jactRedPicketPic.click();
        String exp = pageFactory.getFileReader().getData(1, 4, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void setOnesiePic() {
        onesiePic.click();
        String exp = pageFactory.getFileReader().getData(1, 5, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    //Add to cart function
    public void setBagPackCart() {
        bagPackCart.click();
        String act = bagPackRemove.getText();
        String exp = "REMOVE";
        Assert.assertEquals(act, exp);
    }

    public void setBikeLightCart() {
        bikeLightCart.click();
        String act = bikeLightRemove.getText();
        String exp = prop.getProperty("expRemove");
        Assert.assertEquals(act, exp);
    }

    public void settShirtCart() {
        tShirtCart.click();
        String act = tShirtRemove.getText();
        String exp = prop.getProperty("expRemove");
        Assert.assertEquals(act, exp);
    }

    public void setJacketCart() {
        jacketCart.click();
        String act = jacketRemove.getText();
        String exp = prop.getProperty("expRemove");
        Assert.assertEquals(act, exp);
    }

    public void settRedCart() {
        tRedCart.click();
        String act = tRedRemove.getText();
        String exp = prop.getProperty("expRemove");
        Assert.assertEquals(act, exp);
    }

    public void setOnesieCart() {
        onesieCart.click();
        String act = onesieRemove.getText();
        String exp = prop.getProperty("expRemove");
        Assert.assertEquals(act, exp);
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
