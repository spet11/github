package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverEdge {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","C:\\Users\\sanju\\IdeaProjects\\Software\\Driver\\msedgedriver.exe" );
        WebDriver web = new EdgeDriver();
        web.get("https://demo.nopcommerce.com/");
        web.getTitle();
        web.getCurrentUrl();
    }
}