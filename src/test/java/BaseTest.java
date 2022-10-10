import configuration.WebDriverFactory;
import context.ScenarioContext;
import org.junit.After;
import org.junit.Before;
import utils.RandomUtils;

import static context.ContextConstants.*;

public class BaseTest {
    static WebDriverFactory driver = new WebDriverFactory();

    ScenarioContext constants = ScenarioContext.getInstance();

    @Before
    public void initializeDriver() {
        RandomUtils randomUtils = new RandomUtils("axbycz.com");

        //data.put(MAIL, randomUtils.mail);
        //data.put(PASSWORD, "123abc456");
        constants.data.put(MAIL, "jzlbrgomdsmczytskf@tmmcv.net");
        constants.data.put(PASSWORD, "G3v2c89GHc4wKn9");
        constants.data.put(NAME, "Abc");

        driver.initialize();
    }

    @After
    public void quitDriver() {
        driver.end();

        constants.data.remove(NAME);
        constants.data.remove(PASSWORD);
        constants.data.remove(MAIL);
    }
}
