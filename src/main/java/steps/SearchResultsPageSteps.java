package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.SearchResultsPage;

public class SearchResultsPageSteps {
    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    private SearchResultsPage searchResultsPageSidebar() {
        return pageFactory.on(SearchResultsPage.class);
    }

    public SearchResultsPageSteps verifyNumberOfProductIsDisplayed(int numProducts) {
        // TODO: assertion
        return this;
    }
}
