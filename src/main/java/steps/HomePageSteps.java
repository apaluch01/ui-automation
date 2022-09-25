package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.HomePage;
import org.openqa.selenium.WebDriver;

import static io.qameta.htmlelements.matcher.DisplayedMatcher.displayed;

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

    public HomePageSteps acceptPrivacyModal() {
        homePage().acceptPrivacyButton().click();
        return this;
    }

    public SearchSteps clickSearchButton() {
        homePage().searchButton().click();
        return new SearchSteps(driver);
    }

    public SearchSteps clickCartButton() {
        homePage().searchButton().click();
        return new SearchSteps(driver);
    }
}
