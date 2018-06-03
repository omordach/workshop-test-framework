package pageobject;

import common.LogFactory;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;

public class RegistrationPage extends SideMenu {

    private static final Logger LOG = LogFactory.getLogger(RegistrationPage.class);

//    First Name and Last Name

    @FindBy(id = "name_3_firstname")
    protected WebElement nameInput;

    @FindBy(id = "name_3_lastname")
    protected WebElement lastNameInput;

//    Marital Status

    @FindBy(xpath = "//input[@value='single']")
    protected WebElement maritalStatusSingleRadioButton;

    @FindBy(xpath = "//input[@value='married']")
    protected WebElement maritalStatusMarriedRadioButton;

    @FindBy(xpath = "//input[@value='dingle']")
    protected WebElement maritalStatusDivorcedRadioButton;

//    Hobby

    @FindBy(xpath = "//input[@value='dance']")
    protected WebElement hobbyDanceCheckbox;

    @FindBy(xpath = "//input[@value='reading']")
    protected WebElement hobbyReadingCheckbox;

    @FindBy(xpath = "//input[@value='cricket ']")
    protected WebElement hobbyCricketCheckbox;

//    Country

    @FindBy(id = "dropdown_7")
    protected WebElement countrySelect;


//    Date of Birth

    @FindBy(id = "mm_date_8")
    protected WebElement dateOfBirthMonthSelect;


    @FindBy(id = "dd_date_8")
    protected WebElement dateOfBirthDateSelect;

    @FindBy(id = "yy_date_8")
    protected WebElement dateOfBirthYearSelect;

//    Phone

    @FindBy(id = "phone_9")
    protected WebElement phoneInput;

//    Username

    @FindBy(id = "username")
    protected WebElement usernameInput;

//    Email

    @FindBy(id = "email_1")
    protected WebElement emailInput;

//    Profile pic

    @FindBy(id = "profile_pic_10")
    protected WebElement profilePicUpload;

//    Description

    @FindBy(id = "description")
    protected WebElement descriptionInput;

//    Password

    @FindBy(id = "password_2")
    protected WebElement passwordInput;

    @FindBy(id = "confirm_password_password_2")
    protected WebElement confirmPasswordInput;

//    Submit

    @FindBy(xpath = "//input[@name='pie_submit']")
    protected WebElement submitButton;

    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Step("Filling the name input")
    public RegistrationPage fillNameInput(String input) {
        nameInput.clear();
        nameInput.sendKeys(input);
        LOG.info("Filled name input with text: " + input);
        return this;
    }

    @Step("Filling the last name input")
    public RegistrationPage fillLastNameInput(String input) {
        lastNameInput.clear();
        lastNameInput.sendKeys(input);
        LOG.info("Filled last name input wit text: " + input);
        return this;
    }

    @Step("Select marital status")
    public RegistrationPage selectMaritalStatusSingleRadioButton() {
        maritalStatusSingleRadioButton.click();
        LOG.info("Select Single as marital status");
        return this;
    }

    @Step("Select hobby")
    public RegistrationPage selectHobbyDanceCheckbox() {
        hobbyDanceCheckbox.click();
        LOG.info("Select dance as hobby");
        return this;
    }

    @Step("Select country")
    public RegistrationPage selectCountry(String input) {
        Select countrySelect1 = new Select(countrySelect);
        countrySelect1.selectByValue(input);
        LOG.info("Select " + input + " from country dropdown");
        return this;
    }

    @Step("Select month of birth")
    public RegistrationPage selectDateOfBirthMonthSelect(String input) {
        Select dateOfBirthMonthSelect1 = new Select(dateOfBirthMonthSelect);
        dateOfBirthMonthSelect1.selectByValue(input);
        LOG.info("Select " + input + " from month dropdown");
        return this;
    }

    @Step("Select date of birth")
    public RegistrationPage selectDateOfBirthDateSelect(String input) {
        Select dateOfBirthDateSelect1 = new Select(dateOfBirthDateSelect);
        dateOfBirthDateSelect1.selectByValue(input);
        LOG.info("Select " + input + " from date dropdown");
        return this;
    }

    @Step("Select year of birth")
    public RegistrationPage selectDateOfBirthYearSelect(String input) {
        Select dateOfBirthYearSelect1 = new Select(dateOfBirthYearSelect);
        dateOfBirthYearSelect1.selectByValue(input);
        LOG.info("Select " + input + " from year dropdown");
        return this;
    }

    @Step("Filling the phone input")
    public RegistrationPage fillPhoneInput(String input) {
        phoneInput.clear();
        phoneInput.sendKeys(input);
        LOG.info("Filled phone input with number: " + input);
        return this;
    }

    @Step("Filling the username input")
    public RegistrationPage fillUsernameInput(String input) {
        usernameInput.clear();
        usernameInput.sendKeys(input);
        LOG.info("Filled username input with text: " + input);
        return this;
    }

    @Step("Filling the email input")
    public RegistrationPage fillEmailInput(String input) {
        emailInput.clear();
        emailInput.sendKeys(input);
        LOG.info("Filled email input with text: " + input);
        return this;
    }

    @Step("Uploading profile image")
    public RegistrationPage uploadPprofilePic(String input) {
        profilePicUpload.clear();
        profilePicUpload.sendKeys(input);
        LOG.info("Filled email input with text: " + input);
        return this;
    }

    @Step("Filling the description input")
    public RegistrationPage fillDescriptionInput(String input) {
        descriptionInput.clear();
        descriptionInput.sendKeys(input);
        LOG.info("Filled description input with text: " + input);
        return this;
    }

    @Step("Filling the password input")
    public RegistrationPage fillPasswordInput(String input) {
        passwordInput.clear();
        passwordInput.sendKeys(input);
        LOG.info("Filled password input with text: " + input);
        return this;
    }

    @Step("Filling the confirm password input")
    public RegistrationPage fillConfirmPasswordInput(String input) {
        confirmPasswordInput.clear();
        confirmPasswordInput.sendKeys(input);
        LOG.info("Filled confirm password input with text: " + input);
        return this;
    }

    @Step("Submitting the form")
    public RegistrationPage pressSubmitButton() {
        submitButton.click();
        LOG.info("Submited form");
        return this;
    }
}
