package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface PrivacySettingsModal {
    @Description("Privacy settings modal accept button")
    @FindBy("//*[@id=\"ember61\"]/div/div/button[1]")
    ExtendedMyWebElement acceptPrivacySettings();
}
