package htmlelements;

import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.WebPageFactory;
import io.qameta.htmlelements.statement.RetryStatement;
import org.openqa.selenium.WebDriver;

public class MyPageFactory {

    private WebDriver driver;
    public MyPageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public <T extends WebPage> T on(Class<T> webpage) {
        WebPageFactory webPageFactory = new WebPageFactory();
        webPageFactory.property(RetryStatement.TIMEOUT_KEY, String.valueOf(30));
        return webPageFactory.get(getDriver(), webpage);
    }

    public WebDriver getDriver() {
        return driver; 
    }

}
