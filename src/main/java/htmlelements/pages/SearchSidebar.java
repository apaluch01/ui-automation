package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface SearchSidebar extends ExtendedWebPage {
    @Description("Search input")
    @FindBy("//input[@name='search']")
    ExtendedMyWebElement searchInput();

    @Description("Search submit button")
    @FindBy("//button[@class='btn-link    btn search-btn']")
    ExtendedMyWebElement searchSubmitButton();
}
