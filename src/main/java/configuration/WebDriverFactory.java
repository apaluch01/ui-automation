package configuration;

import enums.Browser;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class WebDriverFactory {
    private WebDriver driver;
    Configuration cfg = ConfigFactory.create(Configuration.class);
    private WebDriver createChromeDriver(Configuration cfg) {
        ChromeDriverManager.chromedriver().browserVersion(cfg.seleniumVersion()).setup();
        this.driver = ChromeDriverManager.chromedriver().create();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return this.driver;
    }

    private WebDriver createFirefoxDriver() {
        FirefoxDriverManager.firefoxdriver().setup();
        this.driver = FirefoxDriverManager.firefoxdriver().create();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return this.driver;
    }

    public void initialize(){
        Browser browser = Browser.valueOf(cfg.browserName().toUpperCase());

        if (browser == Browser.FIREFOX) {
            this.driver = createFirefoxDriver();
        } else {
            this.driver = createChromeDriver(cfg);
        }

        this.driver.get("http://" + cfg.homepageUrl());
        this.driver.manage().window().setSize(new Dimension(cfg.browserWidth(), cfg.browserHeight()));
        System.out.println("initialized"); //TODO: Change with log4j logger
    }

    public void end(){
        this.driver.quit();
        System.out.println("ended"); //TODO: Change with log4j logger
    }

    public WebDriver get(){
        return this.driver;
    }
}
