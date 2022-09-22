import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import steps.OpenPageSteps;

public class SearchTest {
    WebDriverFactory driver = new WebDriverFactory();

    @BeforeEach
    void initializeDriver() {
        driver.initialize();
    }

    @AfterEach
    void quitDriver() {
        driver.end();
    }

    @Test
    public void productNumberShouldBeAsExpected() {
        new OpenPageSteps().openHomepage().acceptPrivacyModal().
                clickSearchButton().inputSearchTerm("0422-2452"). //changed since code provided isn't working
                clickSearchIcon().verifyNumberOfProductIsDisplayed(2);
    }
}
