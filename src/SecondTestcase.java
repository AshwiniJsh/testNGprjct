import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SecondTestcase {
    @Test(priority = 1, dependsOnMethods = {"failTestcase", "testCase"}, alwaysRun = true)
    void Orange() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.orangehrm.com");
        // Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.close();
    }

    @Test(priority = 2)
    void failTestcase() {
        System.out.println("Test case failed");
        Assert.assertEquals(2, 5);
    }

    @Test(priority = 3)
    void testCase() {
        System.out.println("Used this method as a multiple method for orange function");
    }

    @BeforeSuite
    void beforesuite() {
        System.out.println("This will execute before suite");
    }
}
