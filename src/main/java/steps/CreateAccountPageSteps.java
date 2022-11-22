package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.CreateAccountPage;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPageSteps {
    private static MyPageFactory pageFactory;
    private WebDriver driver;

    public CreateAccountPageSteps(WebDriver driver) {
        pageFactory = MyPageFactoryProvider.getInstance(driver);
        this.driver = driver;
    }

    private CreateAccountPage createAccountPage() {
        return pageFactory.on(CreateAccountPage.class);
    }

    @When("I input $field as mail for new account")
    public CreateAccountPageSteps inputEmail(@Named("field") String mail) {
        createAccountPage().emailInput().sendKeys(mail);
        return this;
    }

    @When("I input $field as first name")
    public CreateAccountPageSteps inputFirstName(@Named("field") String firstName) {
        createAccountPage().firstNameInput().sendKeys(firstName);
        return this;
    }

    @When("I input $field as last name")
    public CreateAccountPageSteps inputLastName(@Named("field") String lastName) {
        createAccountPage().lastNameInput().sendKeys(lastName);
        return this;
    }

    @When("I input $field as password for new account")
    public CreateAccountPageSteps inputPassword(@Named("field") String password) {
        createAccountPage().passwordInput().sendKeys(password);
        return this;
    }

    @When("I confirm $field as password for new account")
    public CreateAccountPageSteps confirmPassword( @Named("field")String password) {
        createAccountPage().confirmPasswordInput().sendKeys(password);
        return this;
    }

    @When("I input $field as zip code")
    public CreateAccountPageSteps inputZipCode(@Named("field") String zipCode) {
        createAccountPage().zipCodeInput().sendKeys(zipCode);
        return this;
    }

    @When("I input $field as month")
    public CreateAccountPageSteps chooseMonth(@Named("field") String month) {
        Select monthSelect = new Select(driver.findElement(By.name("month")));
        monthSelect.selectByVisibleText(month);
        return this;
    }

    @When("I input $field as day")
    public CreateAccountPageSteps chooseDay(@Named("field") String day) {
        Select daySelect = new Select(driver.findElement(By.name("day")));
        daySelect.selectByVisibleText(day);
        return this;
    }

    @When("I accept terms")
    public CreateAccountPageSteps acceptTerms() {
        WebElement terms = driver.findElement(By.cssSelector("div[data-test-checkbox=acceptTerms] label"));
        terms.click();
        return this;
    }

    @When("I click create account button")
    public CreateAccountPageSteps createAccount() {
        createAccountPage().createAccountConfirm().click();
        return this;
    }
}
