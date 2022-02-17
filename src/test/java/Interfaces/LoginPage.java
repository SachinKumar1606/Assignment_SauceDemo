package Interfaces;

public interface LoginPage {
    public void login(String uName, String pass) throws InterruptedException;
    void validateLogin(String exp);
}
