import configuration.WebDriverFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    WebDriverFactory driver = new WebDriverFactory();

    @BeforeEach
    void initializeDriver() {
        driver.initialize();
    }

    @AfterEach
    void quitDriver() {
        driver.end();
    }
}
