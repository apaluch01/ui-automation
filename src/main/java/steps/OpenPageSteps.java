package steps;

import configuration.Configuration;
import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.HomePage;
import org.aeonbits.owner.ConfigFactory;

public class OpenPageSteps {
    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();
    Configuration cfg = ConfigFactory.create(Configuration.class);

    private HomePage homePage() {
        return pageFactory.on(HomePage.class);
    }

    public HomePageSteps openHomepage() {
        homePage().open(cfg.homepageUrl());
        return new HomePageSteps();
    }
}
