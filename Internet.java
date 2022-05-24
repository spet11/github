package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internet {
    public static void main(String[] args) {
        System.setProperty("webdriver.internet.driver","C:\\Users\\sanju\\IdeaProjects\\Software\\Driver\\IEDriverServer.exe");
        WebDriver WD = new InternetExplorerDriver();
        WD.get("https://demo.nopcommerce.com/");
        WD.getTitle();

    }
}
