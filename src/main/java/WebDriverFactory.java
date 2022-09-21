import configuration.Configuration;
import enums.Browser;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    private WebDriver driver;
    Configuration cfg = ConfigFactory.create(Configuration.class);
    private WebDriver createChromeDriver(Configuration cfg) {
        ChromeDriverManager.chromedriver().browserVersion(cfg.seleniumVersion()).setup();
        driver = ChromeDriverManager.chromedriver().create();

        return driver;
    }

    private WebDriver createFirefoxDriver() {
        FirefoxDriverManager.firefoxdriver().setup();
        driver = FirefoxDriverManager.firefoxdriver().create();

        return driver;
    }

    public void initialize(){
        Browser browser = Browser.valueOf(cfg.browserName().toUpperCase());

        if (browser == Browser.FIREFOX) {
            driver = createFirefoxDriver();
        } else {
            driver = createChromeDriver(cfg);
        }

        driver.get("http://" + cfg.homepageUrl());
        driver.manage().window().setSize(new Dimension(20, 20));
        System.out.println("initialized"); //TODO: Change with log4j logger
    }

    public void end(){
        driver.quit();
        System.out.println("ended"); //TODO: Change with log4j logger
    }

    public WebDriver get(){
        return driver;
    }
}
