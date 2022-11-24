package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.HomePage;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

public class OpenPageSteps {
    private static MyPageFactory pageFactory;
    private WebDriver driver;

    public OpenPageSteps(WebDriver driver) {
        MyPageFactoryProvider.deleteInstance(driver);
        pageFactory = MyPageFactoryProvider.getInstance(driver);
        this.driver = driver;
    }

    private HomePage homePage() {
        return pageFactory.on(HomePage.class);
    }

    @When("I open the homepage")
    public HomePageSteps openHomepage() {
        return new HomePageSteps(driver);
    }
}
