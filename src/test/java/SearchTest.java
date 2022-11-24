import org.junit.Test;

import steps.OpenPageSteps;

public class SearchTest extends BaseTest {
    @Test
    public void productNumberShouldBeAsExpected() {
        new OpenPageSteps(driver.get()).openHomepage().acceptPrivacyModal().
                clickSearchButton().inputSearchTerm("cat").
                clickSearchIcon().scrollDownForAllResults().verifyNumberOfProductIsDisplayed(9);
    }
}
