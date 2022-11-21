package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.SearchSidebar;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class SearchSteps {
    private static MyPageFactory pageFactory;
    private WebDriver driver;

    public SearchSteps(WebDriver driver) {
        pageFactory = MyPageFactoryProvider.getInstance(driver);
        this.driver = driver;
    }

    private SearchSidebar searchSidebar() {
        return pageFactory.on(SearchSidebar.class);
    }

    @When("I search $value")
    public SearchSteps inputSearchTerm(@Named("value") String term) {
        searchSidebar().searchInput().sendKeys(term);
        return this;
    }

    @When("I click search icon")
    public SearchResultsPageSteps clickSearchIcon() {
        searchSidebar().searchSubmitButton().click();
        return new SearchResultsPageSteps(driver);
    }
}
