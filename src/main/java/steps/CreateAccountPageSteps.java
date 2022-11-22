package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.CreateAccountPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

    public CreateAccountPageSteps inputEmail(String mail) {
        createAccountPage().emailInput().sendKeys(mail);
        return this;
    }

    public CreateAccountPageSteps inputFirstName(String firstName) {
        createAccountPage().firstNameInput().sendKeys(firstName);
        return this;
    }

    public CreateAccountPageSteps inputLastName(String lastName) {
        createAccountPage().lastNameInput().sendKeys(lastName);
        return this;
    }

    public CreateAccountPageSteps inputPassword(String password) {
        createAccountPage().passwordInput().sendKeys(password);
        return this;
    }

    public CreateAccountPageSteps confirmPassword(String password) {
        createAccountPage().confirmPasswordInput().sendKeys(password);
        return this;
    }

    public CreateAccountPageSteps inputZipCode(String zipCode) {
        createAccountPage().zipCodeInput().sendKeys(zipCode);
        return this;
    }

    public CreateAccountPageSteps chooseMonth(String month) {
        Select monthSelect = new Select(driver.findElement(By.name("month")));
        monthSelect.selectByVisibleText(month);
        return this;
    }

    public CreateAccountPageSteps chooseDay(String day) {
        Select daySelect = new Select(driver.findElement(By.name("day")));
        daySelect.selectByVisibleText(day);
        return this;
    }

    public CreateAccountPageSteps acceptTerms() {
        WebElement terms = driver.findElement(By.cssSelector("div[data-test-checkbox=acceptTerms] label"));
        terms.click();
        return this;
    }

    public CreateAccountPageSteps createAccount() {
        createAccountPage().createAccountConfirm().click();
        return this;
    }
}
