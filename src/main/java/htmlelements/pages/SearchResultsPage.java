package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

import java.util.List;

public interface SearchResultsPage extends ExtendedWebPage {
    @Description("Results list")
    @FindBy("//div[contains(@class='qa-search-results-list')]")
    List<ExtendedMyWebElement> resultsList();
}
