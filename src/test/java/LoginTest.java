import org.junit.Test;
import steps.OpenPageSteps;

import static context.ContextConstants.*;

public class LoginTest extends BaseTest{
    @Test
    public void noInputShouldDisplayError() {
        new OpenPageSteps(driver.get()).openHomepage().acceptPrivacyModal().
                clickAccountButton().openLogInSidebar().logIn().checkLoginError().checkEmailError().checkPasswordError();
    }

    @Test
    public void validInputShouldLogIn() {
        new OpenPageSteps(driver.get()).openHomepage().acceptPrivacyModal().
                clickAccountButton().openLogInSidebar().inputEmail((String) constants.data.get(MAIL))
                .inputPassword((String) constants.get(PASSWORD)).logIn().checkLogin();
    }
}
