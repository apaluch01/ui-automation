package configuration;

import enums.Browser;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class WebDriverFactory {
    private WebDriver driver;
    Configuration cfg = ConfigFactory.create(Configuration.class);
    static final Logger LOGGER = Logger.getLogger(String.valueOf(WebDriverFactory.class));

    private WebDriver createChromeDriver(Configuration cfg) {
        ChromeDriverManager.chromedriver().browserVersion(cfg.seleniumVersion()).setup();
        driver = ChromeDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return this.driver;
    }

    private WebDriver createFirefoxDriver() {
        FirefoxDriverManager.firefoxdriver().setup();
        driver = FirefoxDriverManager.firefoxdriver().create();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return this.driver;
    }

    public void initialize(){
        Browser browser = Browser.valueOf(cfg.browserName().toUpperCase());

        if (browser == Browser.FIREFOX) {
            driver = createFirefoxDriver();
        } else {
            driver = createChromeDriver(cfg);
        }

        driver.get("http://" + cfg.homepageUrl());
        driver.manage().window().setSize(new Dimension(cfg.browserWidth(), cfg.browserHeight()));
        LOGGER.info("initialized");
    }

    public void end(){
        driver.quit();
        LOGGER.info("ended");
    }

    public WebDriver get(){
        return this.driver;
    }
}
