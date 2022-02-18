package pages;

import org.checkerframework.checker.units.qual.K;
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

public class HomePage implements Interfaces.HomePage {

    //locators of filters

    @FindBy(className = "inventory_item_name")
    private WebElement item;

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

    private String productLink = "Sauce Labs %s";

    private String image = "item_%s_img_link";

    //Locators of social media sites

    private String Social = "%s";

    //Locators of images of products



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


    //Locators add to cartRemove

    private String remove = "remove-sauce-labs-%s";
    private String addCart = "add-to-cart-sauce-labs-%s";

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
        driver.findElement(By.partialLinkText(String.format(productLink, "Backpack"))).click();
        String exp = pageFactory.getFileReader().getData(1, 0, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void setBikeLight() {
        driver.findElement(By.partialLinkText(String.format(productLink, "Bike Light"))).click();
        String exp = pageFactory.getFileReader().getData(1, 1, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void settShirt() {
        driver.findElement(By.partialLinkText(String.format(productLink, "Bolt T-Shirt"))).click();
        String exp = pageFactory.getFileReader().getData(1, 2, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void setJacket() {
        driver.findElement(By.partialLinkText(String.format(productLink, "Fleece Jacket"))).click();
        String exp = pageFactory.getFileReader().getData(1, 3, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void settRed() {
        driver.findElement(By.partialLinkText("Test.allTheThings() T-Shirt (Red)")).click();
        String exp = pageFactory.getFileReader().getData(1, 4, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);;
    }

    public void setOnesie() {
        driver.findElement(By.partialLinkText(String.format(productLink, "Onesie"))).click();
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
        driver.findElement(By.id(String.format(image, "4"))).click();
        String exp = pageFactory.getFileReader().getData(1, 0, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void setBikeLightPic() {
        driver.findElement(By.id(String.format(image, "0"))).click();
        String exp = pageFactory.getFileReader().getData(1, 1, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void settShirtPic() {
        driver.findElement(By.id(String.format(image, "1"))).click();
        String exp = pageFactory.getFileReader().getData(1, 2, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void setJacketPic() {
        driver.findElement(By.id(String.format(image, "5"))).click();
        String exp = pageFactory.getFileReader().getData(1, 3, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void settRedPic() {
        driver.findElement(By.id(String.format(image, "3"))).click();
        String exp = pageFactory.getFileReader().getData(1, 4, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    public void setOnesiePic() {
        driver.findElement(By.id(String.format(image, "2"))).click();
        String exp = pageFactory.getFileReader().getData(1, 5, 1);
        String act = driver.getCurrentUrl();
        Assert.assertEquals(act, exp);
    }

    //Add to cart function
    public void setBagPackCart() {
        driver.findElement(By.id(String.format(addCart, "backpack"))).click();
        String act = driver.findElement(By.id(String.format(remove, "backpack"))).getText();
        String exp = "REMOVE";
        Assert.assertEquals(act, exp);
    }

    public void setBikeLightCart() {
        driver.findElement(By.id(String.format(addCart, "bike-light"))).click();
        String act = driver.findElement(By.id(String.format(remove, "bike-light"))).getText();
        String exp = prop.getProperty("expRemove");
        Assert.assertEquals(act, exp);
    }

    public void settShirtCart() {
        driver.findElement(By.id(String.format(addCart, "bolt-t-shirt"))).click();
        String act = driver.findElement(By.id(String.format(remove, "bolt-t-shirt"))).getText();
        String exp = prop.getProperty("expRemove");
        Assert.assertEquals(act, exp);
    }

    public void setJacketCart() {
        driver.findElement(By.id(String.format(addCart, "fleece-jacket"))).click();
        String act = driver.findElement(By.id(String.format(remove, "fleece-jacket"))).getText();
        String exp = prop.getProperty("expRemove");
        Assert.assertEquals(act, exp);
    }

    public void settRedCart() {
        driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
        String act = driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)")).getText();
        String exp = prop.getProperty("expRemove");
        Assert.assertEquals(act, exp);
    }

    public void setOnesieCart() {
        driver.findElement(By.id(String.format(addCart, "onesie"))).click();
        String act = driver.findElement(By.id(String.format(remove, "onesie"))).getText();
        String exp = prop.getProperty("expRemove");
        Assert.assertEquals(act, exp);
    }

    //Link check if social media accounts.
    public void setTwitter() {
        driver.findElement(By.partialLinkText(String.format(Social, "Twitter"))).click();
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
        driver.findElement(By.partialLinkText(String.format(Social, "Facebook"))).click();
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
        driver.findElement(By.partialLinkText(String.format(Social, "LinkedIn"))).click();
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
