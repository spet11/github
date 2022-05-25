package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera {

    public static void main(String[] args) {
        System.setProperty("webdriver.opera.driver","C:\\Users\\sanju\\IdeaProjects\\Software\\Driver.operadriver.exe");
        WebDriver dr = new OperaDriver();
        dr.get("https://demo.nopcommerce.com/");
        String url = dr.getCurrentUrl();
        System.out.println(url);
        dr.manage().window().maximize();
        String title=dr.getTitle();
        dr.close();








    }
}
