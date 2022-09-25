import org.junit.Test;
import steps.OpenPageSteps;

public class LoginTest extends BaseTest{
    @Test
    public void noInputShouldnDisplayError() {
        new OpenPageSteps(driver.get()).openHomepage().acceptPrivacyModal().
                clickAccountButton().openLogInSidebar().logIn().checkErrors();
    }
}
