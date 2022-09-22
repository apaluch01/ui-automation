import org.junit.Test;

import steps.OpenPageSteps;

public class SearchTest extends BaseTest {
    @Test
    public void productNumberShouldBeAsExpected() {
        new OpenPageSteps().openHomepage().acceptPrivacyModal().
                clickSearchButton().inputSearchTerm("0422-2452"). //changed since code provided isn't working
                clickSearchIcon().verifyNumberOfProductIsDisplayed(2);
    }
}
