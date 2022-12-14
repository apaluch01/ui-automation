package steps;

import htmlelements.MyPageFactory;
import htmlelements.pages.HomePage;
import org.openqa.selenium.WebDriver;

public class OpenPageSteps {
    private static MyPageFactory pageFactory;
    private WebDriver driver;

    public OpenPageSteps(WebDriver driver) {
        //MyPageFactoryProvider.deleteInstance(driver);
        pageFactory = new MyPageFactory(driver);
        this.driver = driver;
    }

    private HomePage homePage() {
        return pageFactory.on(HomePage.class);
    }

    public HomePageSteps openHomepage() {
        return new HomePageSteps(driver);
    }
}
