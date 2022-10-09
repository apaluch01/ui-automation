import org.junit.Test;
import steps.OpenPageSteps;
import static context.ContextConstants.*;

public class CreateAccountTest extends BaseTest{
    @Test
    public void validAccountShouldCreate() {
        new OpenPageSteps(driver.get()).openHomepage().acceptPrivacyModal().
                clickAccountButton().openAccountCreationPage().inputFirstName((String) constants.data.get(NAME)).
                inputLastName("XYZ").confirmPassword((String) constants.data.get(PASSWORD)).inputZipCode("90001").
                chooseMonth("January").chooseDay("17");
    }
}
