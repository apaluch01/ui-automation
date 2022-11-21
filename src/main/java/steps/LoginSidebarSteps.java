package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.LoginSidebar;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
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

    @When("I input $field as login mail")
    public LoginSidebarSteps inputEmail(@Named("field") String mail) {
        loginSidebar().emailInput().sendKeys(mail);
        return this;
    }

    @When("I input $field as login password")
    public LoginSidebarSteps inputPassword(@Named("field") String password) {
        loginSidebar().passwordInput().sendKeys(password);
        return this;
    }

    @When("I click log in")
    public LoginSidebarSteps logIn() {
        loginSidebar().loginButton().click();
        return this;
    }

    @Then("I am logged in")
    public LoginSidebarSteps checkLogin() {
        Assert.assertNotNull(loginSidebar().signOutButton());
        return this;
    }

    @Then("There is no login error")
    public LoginSidebarSteps checkLoginError() {
        Assert.assertNotNull(loginSidebar().loginError());
        return this;
    }

    @Then("There is no email error")
    public LoginSidebarSteps checkEmailError() {
        Assert.assertNotNull(loginSidebar().emailError());
        return this;
    }

    @Then("There is no password error")
    public LoginSidebarSteps checkPasswordError() {
        Assert.assertNotNull(loginSidebar().passwordError());
        return this;
    }
}
