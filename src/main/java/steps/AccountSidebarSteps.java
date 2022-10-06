package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.AccountSidebar;
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

    public LoginSidebarSteps openLogInSidebar() {
        accountSidebar().signInButton().click();
        return new LoginSidebarSteps(driver);
    }

    public CreateAccountPageSteps openAccountCreationPage() {
        accountSidebar().createAccountButton().click();
        return new CreateAccountPageSteps(driver);
    }
}
