package htmlelements;

import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.WebPageFactory;
import io.qameta.htmlelements.statement.RetryStatement;
import org.openqa.selenium.WebDriver;

public class MyPageFactory {
    public <T extends WebPage> T on(Class<T> webpage) {
        WebPageFactory webPageFactory = new WebPageFactory();
        webPageFactory.property(RetryStatement.TIMEOUT_KEY, String.valueOf(30)); // TODO: Create timeout as configurable property
        return webPageFactory.get(getDriver(), webpage);
    }

    public WebDriver getDriver() {
        return null; //TODO: Here you need to pass WebDriver instance from configuration.WebDriverFactory.get();
    }

}
