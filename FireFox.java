package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) {
       System.setProperty("webdriver.firefox.marionette","C:\\Users\\sanju\\IdeaProjects\\Software\\Driver\\geckodriver.exe");
        WebDriver we = new FirefoxDriver();
        we.get("https://demo.nopcommerce.com/");
        String Title = we.getTitle();
        System.out.println("Page title is:" + Title);
        String url = we.getCurrentUrl();
        System.out.println(url);
        we.manage().window().maximize();
        we.navigate().refresh();
        we.navigate().forward();
        we.close();


    }

}
