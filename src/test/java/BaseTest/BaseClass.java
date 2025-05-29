package BaseTest;

import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static FileInputStream fis1;
    public static Properties configProp;
    public static FileInputStream fis2;
    public static Properties locatorsProp;

  
	@BeforeMethod
    public void setUp(Method method) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\mukesh.ganivada\\Downloads\\edgedriver_win64 (7)\\msedgedriver.exe");

        WebDriver localDriver = new EdgeDriver();
        driver.set(localDriver);

        getDriver().manage().window().maximize();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().navigate().to("https://tutorialsninja.com/demo/");
    }

    @AfterMethod
    public void teardown() {
        getDriver().quit();
        driver.remove(); // cleanup to prevent memory leaks
    }
}
