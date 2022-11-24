package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface HomePage extends ExtendedWebPage {
    @Description("Privacy settings modal")
    @FindBy("//div[@class='bottom-container _bottom-container_128srs']")
    ExtendedMyWebElement privacySettingsModal();

    @Description("Privacy settings modal accept button")
    @FindBy("//button[@class='btn btn-primary qa-btn-accept-cookie   btn-block btn-sm qa-btn-accept-cookie _btn-accept-cookie_1eoaez']")
    ExtendedMyWebElement acceptPrivacyButton();

    @Description("Header search button")
    @FindBy("//a[@class='clickable qa-show-sidetray-search sidetray-search']")
    ExtendedMyWebElement searchButton();

    @Description("Header cart button")
    @FindBy("//a[@class='ember-view bag-button underline-on-hover qa-tnav-bag-icon __fa246']")
    ExtendedMyWebElement cartButton();

    @Description("Header account button")
    @FindBy("//a[@class='clickable qa-show-sidetray-account sidetray-account']")
    ExtendedMyWebElement accountButton();
}
