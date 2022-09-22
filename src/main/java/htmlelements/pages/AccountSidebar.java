package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface AccountSidebar extends ExtendedWebPage {
    @Description("Sign in button")
    @FindBy("//*[@id=\"modal-ember60\"]/div/div[2]/div[1]/button")
    ExtendedMyWebElement signInButton();
}
