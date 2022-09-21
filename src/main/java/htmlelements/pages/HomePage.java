package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface HomePage extends ExtendedWebPage {
    @Description("Privacy settings modal")
    @FindBy("/html/body/div[4]/div")
    ExtendedMyWebElement privacySettingsModal();

    @Description("Header button")
    @FindBy("/html/body/div[2]/div[4]/a")
    ExtendedMyWebElement headerButton();

    @Description("Cart button")
    @FindBy("//*[@id=\"ember4\"]")
    ExtendedMyWebElement cartButton();
}
