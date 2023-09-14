import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowserTestingClass {

    @Test
    public void testBrowserLaunch() {
     // set the system property for Chrome driver
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
     // Create driver object for CHROME browser
        ChromeDriver driver = new ChromeDriver();

     //Launch the URL using driver object
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("Pass URL needed");//sample https://
     // get the current URL of the page and assert the same
        String URL= driver.getCurrentUrl();
        Assert.assertEquals(URL,"Passed URL needed");
     // get the title of the page and assert the same
        String title = driver.getTitle();
        Assert.assertEquals(title,"Googledata");
    }
}
