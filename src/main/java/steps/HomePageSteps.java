package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.HomePage;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {
    private static MyPageFactory pageFactory;
    private WebDriver driver;

    public HomePageSteps(WebDriver driver) {
        pageFactory = MyPageFactoryProvider.getInstance(driver);
        this.driver = driver;
    }

    private HomePage homePage() {
        return pageFactory.on(HomePage.class);
    }

    @When("I accept privacy modal")
    public HomePageSteps acceptPrivacyModal() {
        homePage().acceptPrivacyButton().click();
        return this;
    }

    @When("I click search button")
    public SearchSteps clickSearchButton() {
        homePage().searchButton().click();
        return new SearchSteps(driver);
    }

    @When("I click account button")
    public AccountSidebarSteps clickAccountButton() {
        homePage().accountButton().click();
        return new AccountSidebarSteps(driver);
    }
}
