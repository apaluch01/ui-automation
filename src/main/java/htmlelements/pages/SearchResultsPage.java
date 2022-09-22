package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

import java.util.List;

public interface SearchResultsPage extends ExtendedWebPage {
    @Description("Results list")
    @FindBy("//*[@id=\"main-content-focus\"]/div[2]/div[2]/div/div[2]/div[1]/*div")
    List<ExtendedMyWebElement> resultsList();
}