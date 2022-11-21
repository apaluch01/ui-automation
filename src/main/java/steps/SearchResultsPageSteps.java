package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.SearchResultsPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
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

    @Then("I should see $result results")
    public SearchResultsPageSteps verifyNumberOfProductIsDisplayed(@Named("result") int numProducts) {
        Assert.assertEquals(numProducts, searchResultsPage().resultsList().size());
        return this;
    }
}
