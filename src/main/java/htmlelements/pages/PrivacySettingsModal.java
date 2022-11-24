package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface PrivacySettingsModal extends ExtendedWebPage {
    @Description("Privacy settings modal accept button")
    @FindBy("//button[@class='btn btn-primary qa-btn-accept-cookie   btn-block btn-sm qa-btn-accept-cookie _btn-accept-cookie_1eoaez']")
    ExtendedMyWebElement acceptPrivacyButton();
}
