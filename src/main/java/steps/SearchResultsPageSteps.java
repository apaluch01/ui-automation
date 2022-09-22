package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.SearchResultsPage;
import org.junit.Assert;

public class SearchResultsPageSteps {
    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    private SearchResultsPage searchResultsPage() {
        return pageFactory.on(SearchResultsPage.class);
    }

    public SearchResultsPageSteps verifyNumberOfProductIsDisplayed(int numProducts) {
        Assert.assertEquals(searchResultsPage().resultsList().size(), numProducts);
        return this;
    }
}
