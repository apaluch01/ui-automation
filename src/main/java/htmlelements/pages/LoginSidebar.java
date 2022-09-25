package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface LoginSidebar extends ExtendedWebPage {
    @Description("Email input for login")
    @FindBy("//input[@class='ember-text-field ember-view form-control form-control form-input-username']")
    ExtendedMyWebElement emailInput();

    @Description("Password input for login")
    @FindBy("//input[@class='ember-text-field ember-view form-control form-control form-input-password']")
    ExtendedMyWebElement passwordInput();

    @Description("Sign in button")
    @FindBy("//button[@data-test-btn='login']")
    ExtendedMyWebElement loginButton();

    @Description("Login error message")
    @FindBy("//span[@class='un-error-icon']")
    ExtendedMyWebElement loginError();

    @Description("Login email error message")
    @FindBy("//span[@class='un-error-icon']")
    ExtendedMyWebElement emailError();

    @Description("Login password error message")
    @FindBy("//span[@class='un-error-icon']")
    ExtendedMyWebElement passwordError();
}
