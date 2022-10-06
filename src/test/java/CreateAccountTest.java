import org.junit.Test;
import steps.OpenPageSteps;
import utils.RandomUtils;

public class CreateAccountTest extends BaseTest{
    @Test
    public void validAccountShouldCreate() {
        RandomUtils randomUtils = new RandomUtils("axbycz.com");

        new OpenPageSteps(driver.get()).openHomepage().acceptPrivacyModal().
                clickAccountButton().openAccountCreationPage().inputFirstName("ABC").
                inputLastName("XYZ").confirmPassword("ieodj9d389").inputZipCode("90001").
                chooseMonth("January").chooseDay("17");
    }
}
