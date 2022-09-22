package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface SearchSidebar extends ExtendedWebPage {
    @Description("Search input")
    @FindBy("//*[@id=\"ember435-input\"]")
    ExtendedMyWebElement searchInput();

    @Description("Search submit button")
    @FindBy("//*[@id=\"modal-ember433\"]/div/div[2]/form/button")
    ExtendedMyWebElement searchSubmitButton();
}
