import org.junit.Test;
import steps.OpenPageSteps;

public class LoginTest extends BaseTest{
    @Test
    public void noInputShouldDisplayError() {
        new OpenPageSteps(driver.get()).openHomepage().acceptPrivacyModal().
                clickAccountButton().openLogInSidebar().logIn().checkLoginError().checkEmailError().checkPasswordError();
    }

    @Test
    public void validInputShouldLogIn() {
        new OpenPageSteps(driver.get()).openHomepage().acceptPrivacyModal().
                clickAccountButton().openLogInSidebar().inputEmail("jzlbrgomdsmczytskf@tmmcv.net").inputPassword("G3v2c89GHc4wKn9").
                logIn().checkLogin();
    }
}
