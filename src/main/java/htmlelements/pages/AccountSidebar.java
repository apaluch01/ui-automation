package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface AccountSidebar extends ExtendedWebPage {
    @Description("Sign in button")
    @FindBy("//button[@class='btn btn-secondary qa-btn-signin btn-sm btn-action un-text-lowercase']")
    ExtendedMyWebElement signInButton();

    @Description("Create account button")
    @FindBy("//a[@class='ember-view btn btn-sm btn-secondary qa-btn-register btn-action']")
    ExtendedMyWebElement createAccountButton();
}
