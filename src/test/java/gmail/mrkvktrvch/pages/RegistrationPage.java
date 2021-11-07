package gmail.mrkvktrvch.pages;

import com.codeborne.selenide.SelenideElement;
import gmail.mrkvktrvch.pages.components.CalendarComponent;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    //elements
    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail").setValue("mrkvktrvch@gmail.com"),
            genderRadioButton = $("[for=gender-radio-1]"),
            userNumberInput = $("#userNumber"),
            subjectsInput =   $("#subjectsInput"),
            hobbiesCheckbox = $("[for=hobbies-checkbox-2"),
            uploadPicture = $("#uploadPicture"),
            addressInput =  $("#currentAddress"),
            stateInput =  $("#react-select-3-input"),
            cityInput =  $("#react-select-4-input"),
            submitButton = $(".btn.btn-primary");

    public CalendarComponent calendarComponent = new CalendarComponent();

    //actions
    public RegistrationPage setFirstName (String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setLastName (String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setEmail (String value) {
        userEmailInput.setValue(value);
        return this;
    }

    public RegistrationPage chooseGender () {
        genderRadioButton.click();
        return this;
    }

    public RegistrationPage setNumber (String value) {
        userNumberInput.setValue(value);
        return this;
    }

    public RegistrationPage setSubjects (String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage clickHobbiesCheckBox () {
        hobbiesCheckbox.click();
        return this;
    }

    public RegistrationPage downloadPicture () {
        uploadPicture.uploadFromClasspath("structure.png");
        return this;
    }

    public RegistrationPage setAddress (String value) {
        addressInput.setValue(value);
        return this;
    }

    public RegistrationPage setState (String value) {
        stateInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage setCity (String value) {
        cityInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage pressSubmitButton () {
        submitButton.pressEnter();
        return this;
    }
}
