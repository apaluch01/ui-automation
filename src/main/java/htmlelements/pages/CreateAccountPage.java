package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface CreateAccountPage extends ExtendedWebPage {
    @Description("Email input field")
    @FindBy("//input[@placeholder='Email']")
    ExtendedMyWebElement emailInput();

    @Description("First name input field")
    @FindBy("//input[@name='firstname']")
    ExtendedMyWebElement firstNameInput();

    @Description("Last name input field")
    @FindBy("//input[@name='lastname']")
    ExtendedMyWebElement lastNameInput();

    @Description("Password input field")
    @FindBy("//input[@placeholder='Password']")
    ExtendedMyWebElement passwordInput();

    @Description("Password confirmation input field")
    @FindBy("//input[@name='confirm_password']")
    ExtendedMyWebElement confirmPasswordInput();

    @Description("Zip code input field")
    @FindBy("//input[@name='postalCode']")
    ExtendedMyWebElement zipCodeInput();

    @Description("Birthday month select field")
    @FindBy("//select[@name='month']")
    ExtendedMyWebElement monthSelect();

    @Description("Birthday date select field")
    @FindBy("//select[@name='day']")
    ExtendedMyWebElement daySelect();

    @Description("Accept terms checkbox")
    @FindBy("//input[@name='acceptTerms']")
    ExtendedMyWebElement acceptTerms();

    @Description("Final create account button")
    @FindBy("//button[@class='btn btn-primary qa-btn-register  btn-block']")
    ExtendedMyWebElement createAccountConfirm();
}
