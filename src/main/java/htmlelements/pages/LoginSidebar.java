package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface LoginSidebar extends ExtendedWebPage {
    @Description("Email input for login")
    @FindBy("//input[@name='username')")
    ExtendedMyWebElement emailInput();

    @Description("Password input for login")
    @FindBy("//input[@name='password']")
    ExtendedMyWebElement passwordInput();

    @Description("Sign in button")
    @FindBy("//button[@class='btn btn-primary qa-btn-login   btn-block']")
    ExtendedMyWebElement loginButton();
}
