package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.SearchResultsPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class SearchResultsPageSteps {
    private static MyPageFactory pageFactory;
    private WebDriver driver;

    public SearchResultsPageSteps(WebDriver driver) {
        pageFactory = MyPageFactoryProvider.getInstance(driver);
        this.driver = driver;
    }

    private SearchResultsPage searchResultsPage() {
        return pageFactory.on(SearchResultsPage.class);
    }

    public SearchResultsPageSteps verifyNumberOfProductIsDisplayed(int numProducts) {
        Assert.assertEquals(numProducts, searchResultsPage().resultsList().size());
        return this;
    }
}
