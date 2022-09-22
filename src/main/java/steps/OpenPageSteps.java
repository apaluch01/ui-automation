package steps;

import configuration.Configuration;
import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.HomePage;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;

public class OpenPageSteps {
    private static MyPageFactory pageFactory;
    private WebDriver driver;

    Configuration cfg = ConfigFactory.create(Configuration.class);

    public OpenPageSteps(WebDriver driver) {
        pageFactory = MyPageFactoryProvider.getInstance(driver);
        this.driver = driver;
        System.out.println(driver);
    }

    private HomePage homePage() {
        return pageFactory.on(HomePage.class);
    }

    public HomePageSteps openHomepage() {
        homePage().open(cfg.homepageUrl());
        return new HomePageSteps(driver);
    }
}
