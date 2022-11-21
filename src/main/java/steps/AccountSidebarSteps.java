package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.AccountSidebar;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class AccountSidebarSteps {
    private static MyPageFactory pageFactory;
    private WebDriver driver;

    public AccountSidebarSteps(WebDriver driver) {
        pageFactory = MyPageFactoryProvider.getInstance(driver);
        this.driver = driver;
    }

    private AccountSidebar accountSidebar() {
        return pageFactory.on(AccountSidebar.class);
    }

    @When("I open the log in sidebar")
    public LoginSidebarSteps openLogInSidebar() {
        accountSidebar().signInButton().click();
        return new LoginSidebarSteps(driver);
    }

    @When("I click create account button")
    public CreateAccountPageSteps openAccountCreationPage() {
        accountSidebar().createAccountButton().click();
        return new CreateAccountPageSteps(driver);
    }
}
