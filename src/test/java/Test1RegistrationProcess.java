import common.TestBase;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Test1RegistrationProcess extends TestBase {


    @DataProvider(name = "Registration")

    public static Object[][] credentials() {

        return new Object[][]{
                {"Oleh", "Mordach", "Ukraine", "5", "2", "1988", "0637315500", "omordach1",
                        "omordach+1@gmail.com", "/home/oleh/workshoptestframework/src/test/resources/pic.png",
                        "Lorem ipsum dolor si amet", "Oleg27Oleg27", "Oleg27Oleg27"},

                {"Oleh", "Mordach", "Ukraine", "5", "2", "1988", "0637315500", "omordach2",
                        "omordach+2@gmail.com", "/home/oleh/workshoptestframework/src/test/resources/pic.png",
                        "Lorem ipsum dolor si amet", "Oleg27Oleg27", "Oleg27Oleg27"}};
    }


    @Test(dataProvider = "Registration")
    @Description("Test case for registration process (positive scenario). Using data provider for user data.")
    public void testHomePage(String FirstName, String LastName, String Country, String Month, String Day, String Year,
                             String Phone, String Username, String Email, String Path, String Desc, String Pass,
                             String CPass) {
        homePage
                .clickRegistrationButton()
                .fillNameInput(FirstName)
                .fillLastNameInput(LastName)
                .selectMaritalStatusSingleRadioButton()
                .selectHobbyDanceCheckbox()
                .selectCountry(Country)
                .selectDateOfBirthMonthSelect(Month)
                .selectDateOfBirthDateSelect(Day)
                .selectDateOfBirthYearSelect(Year)
                .fillPhoneInput(Phone)
                .fillUsernameInput(Username)
                .fillEmailInput(Email)
                .uploadPprofilePic(Path)
                .fillDescriptionInput(Desc)
                .fillPasswordInput(Pass)
                .fillConfirmPasswordInput(CPass)
                .pressSubmitButton();

        Assert.assertTrue(driver.findElement(By.cssSelector(".piereg_message"))
                .getText().equals("Thank you for your registration"));

    }
}