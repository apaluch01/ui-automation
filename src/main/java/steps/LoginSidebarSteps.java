package steps;

import htmlelements.ExtendedMyWebElement;
import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.AccountSidebar;
import htmlelements.pages.LoginSidebar;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSidebarSteps {
    private static MyPageFactory pageFactory;
    private WebDriver driver;

    public LoginSidebarSteps(WebDriver driver) {
        pageFactory = MyPageFactoryProvider.getInstance(driver);
        this.driver = driver;
    }

    private LoginSidebar loginSidebar() {
        return pageFactory.on(LoginSidebar.class);
    }

    public LoginSidebarSteps inputEmail(String mail) {
        loginSidebar().emailInput().sendKeys(mail);
        return this;
    }

    public LoginSidebarSteps inputPassword(String password) {
        loginSidebar().passwordInput().sendKeys(password);
        return this;
    }

    public LoginSidebarSteps logIn() {
        loginSidebar().loginButton().click();
        return this;
    }

    public LoginSidebarSteps checkErrors() {
        Assert.assertNotNull(loginSidebar().loginError());
        Assert.assertNotNull(loginSidebar().emailError());
        Assert.assertNotNull(loginSidebar().passwordError());
        return this;
    }
}
