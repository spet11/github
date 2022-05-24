package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverConcept {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sanju\\IdeaProjects\\Software\\Driver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        String title= driver.getTitle();
        System.out.println("Page title is: " + title);






        //driver.close();
       // driver.getTitle();

        //driver.getWindowHandle();




    }

}
