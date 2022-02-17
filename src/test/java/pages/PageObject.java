package pages;


public class PageObject {

    private LoginPage loginPage;
    private HomePage homePage;
    private FileReader fileReader;
    private CartPage cartPage;
    private CheckOutPage checkOutPage;



    public LoginPage getLoginPage() {
        if(loginPage == null){
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public HomePage getHomePage() {
        if(homePage == null){
            homePage = new HomePage();
        }
        return homePage;
    }

    public FileReader getFileReader() {
        String path = System.getProperty("user.dir")+"\\src/test/java/Resorces/Data.xlsx";
        if(fileReader == null){
            fileReader = new FileReader(path);
        }
        return fileReader;
    }

    public CartPage getCartPage() {
        if(cartPage == null){
            cartPage = new CartPage();
        }
        return cartPage;
    }

    public CheckOutPage getCheckOutPage() {
        if (checkOutPage == null){
            checkOutPage = new CheckOutPage();
        }
        return checkOutPage;
    }

}