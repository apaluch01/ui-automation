import configuration.WebDriverFactory;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    WebDriverFactory driver = new WebDriverFactory();

    @Before
    public void initializeDriver() {
        driver.initialize();
        System.out.println(driver.get());
    }

    @After
    public void quitDriver() {
        driver.end();
    }
}
