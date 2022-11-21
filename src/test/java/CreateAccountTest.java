import org.junit.Test;
import steps.OpenPageSteps;
import static context.ContextConstants.*;

public class CreateAccountTest extends BaseTest{
    @Test
    public void validAccountShouldCreate() {
        new OpenPageSteps(driver.get()).openHomepage().acceptPrivacyModal().
                clickAccountButton().openAccountCreationPage().
                inputFirstName(accountData.getFirstName()).
                inputLastName(accountData.getLastName()).
                confirmPassword((String) constants.data.get(PASSWORD)).
                inputZipCode(accountData.getZipCode()).
                chooseMonth(accountData.getBirthMonth()).
                chooseDay(accountData.getBirthDay());
    }
}
