import enums.Browser;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    private WebDriver driver;
    Configuration cfg = ConfigFactory.create(Configuration.class);
    private WebDriver createChromeDriver(Configuration cfg) {
        WebDriver driver = new ChromeDriver();
        ChromeDriverManager.chromedriver().browserVersion(cfg.seleniumVersion()).setup();

        return driver;
    }

    private WebDriver createFirefoxDriver() {
        WebDriver driver = new FirefoxDriver();
        FirefoxDriverManager.firefoxdriver().setup();

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
