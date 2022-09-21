package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.element.ExtendedList;

public interface HomePage extends ExtendedWebPage {
    @Description("Privacy settings modal")
    @FindBy("//*[@id=\"ember61\"]/div/div/button[1]")
    ExtendedMyWebElement acceptPrivacyButton();

    @Description("Header search button")
    @FindBy("//*[@id=\"main-header\"]/div/div[1]/ul/li[2]/a")
    ExtendedMyWebElement searchButton();

    @Description("Cart button")
    @FindBy("//*[@id=\"ember4\"]")
    ExtendedMyWebElement cartButton();
}
