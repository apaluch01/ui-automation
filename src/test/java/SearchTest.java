import org.junit.Test;

import steps.OpenPageSteps;

public class SearchTest extends BaseTest {
    @Test
    public void productNumberShouldBeAsExpected() {
        new OpenPageSteps(driver.get()).openHomepage().acceptPrivacyModal().
                clickSearchButton().inputSearchTerm("0422-2452").
                clickSearchIcon().verifyNumberOfProductIsDisplayed(2);
    }
}
