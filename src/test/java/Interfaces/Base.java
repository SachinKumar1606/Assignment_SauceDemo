package Interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Base {
    public  void launch() throws IOException;
    public void closeBrowser();
    public void closeAllBrowser();
}
