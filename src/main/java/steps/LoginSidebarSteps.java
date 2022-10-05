package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
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

    public LoginSidebarSteps checkLogin() {
        Assert.assertNotNull(loginSidebar().signOutButton());
        return this;
    }

    public LoginSidebarSteps checkLoginError() {
        Assert.assertNotNull(loginSidebar().loginError());
        return this;
    }

    public LoginSidebarSteps checkEmailError() {
        Assert.assertNotNull(loginSidebar().emailError());
        return this;
    }

    public LoginSidebarSteps checkPasswordError() {
        Assert.assertNotNull(loginSidebar().passwordError());
        return this;
    }
}
