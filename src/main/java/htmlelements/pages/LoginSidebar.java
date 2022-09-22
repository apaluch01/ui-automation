package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface LoginSidebar extends ExtendedWebPage {
    @Description("Email input for login")
    @FindBy("//*[@id=\"ember68-input\"]")
    ExtendedMyWebElement emailInput();

    @Description("Password input for login")
    @FindBy("//*[@id=\"ember69-input\"]")
    ExtendedMyWebElement passwordInput();

    @Description("Sign in button")
    @FindBy("//*[@id=\"modal-ember66\"]/div/div[2]/div/div/form/div/button")
    ExtendedMyWebElement loginButton();
}
