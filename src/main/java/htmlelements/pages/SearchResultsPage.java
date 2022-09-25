package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

import java.util.List;

public interface SearchResultsPage extends ExtendedWebPage {
    @Description("Results list")
    @FindBy("//div[@class='product-tile qa-product-tile __eadf2 col-md-4 col-xs-6 qa-search-result-item']")
    List<ExtendedMyWebElement> resultsList();
}
