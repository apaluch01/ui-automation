package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.SearchSidebar;

public class SearchSteps {
    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    private SearchSidebar searchSidebar() {
        return pageFactory.on(SearchSidebar.class);
    }

    public SearchSteps inputSearchTerm(String term) {
        searchSidebar().searchInput().sendKeys(term);
        return this;
    }

    public SearchResultsPageSteps clickSearchIcon() {
        searchSidebar().searchSubmitButton().click();
        return new SearchResultsPageSteps();
    }
}
