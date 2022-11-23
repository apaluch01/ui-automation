import com.google.gson.Gson;
import configuration.WebDriverFactory;
import context.ScenarioContext;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import utils.Account;
import utils.RandomUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static context.ContextConstants.*;

public class BaseTest {
    static WebDriverFactory driver = new WebDriverFactory();
    ScenarioContext constants = ScenarioContext.getInstance();
    static Account accountData;

    @Given("I load account data")
    @BeforeClass
    public static void loadNewAccountData() throws IOException {
        String file = "src/main/resources/accounts.json";
        String json = new String(Files.readAllBytes(Paths.get(file)));
        accountData = new Gson().fromJson(json, Account.class);
    }

    @Given("I initialize driver")
    @Before
    public void initializeDriver() {
        RandomUtils randomUtils = new RandomUtils("axbycz.com");

        constants.data.put(MAIL, randomUtils.mail);
        constants.data.put(PASSWORD, "123abc456");
        //constants.data.put(MAIL, "jzlbrgomdsmczytskf@tmmcv.net");
        //constants.data.put(PASSWORD, "G3v2c89GHc4wKn9"); already used data, proper for login tests

        driver.initialize();
    }

    @Then("Driver quits")
    @After
    public void quitDriver() {
        driver.end();

        constants.data.remove(PASSWORD);
        constants.data.remove(MAIL);
    }
}
