import configuration.Configuration;
import configuration.WebDriverFactory;
import org.aeonbits.owner.ConfigFactory;

public class Main {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
        Configuration cfg = ConfigFactory.create(Configuration.class);

        System.out.println(cfg.browserName());
        System.out.println(cfg.browserWidth());
        System.out.println(cfg.browserHeight());
        System.out.println(cfg.seleniumVersion());
        System.out.println(cfg.homepageUrl());

        WebDriverFactory driver = new WebDriverFactory();
        driver.initialize();
        System.out.println(driver.get());
        driver.end();
    }
}
