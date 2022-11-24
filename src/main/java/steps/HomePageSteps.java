package steps;

import htmlelements.MyPageFactory;
import htmlelements.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {
    private static MyPageFactory pageFactory;
    private WebDriver driver;

    public HomePageSteps(WebDriver driver) {
        pageFactory = new MyPageFactory(driver);
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

    public AccountSidebarSteps clickAccountButton() {
        homePage().accountButton().click();
        return new AccountSidebarSteps(driver);
    }
}
