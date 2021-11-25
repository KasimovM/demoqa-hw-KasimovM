package gmail.mrkvktrvch.tests;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class TestingPracticeForm extends TestData {

    @Test
    void registrationTest() {
        step("Fill students registration form", () -> {
            step("Fill common data", () -> {
                registrationPage
                        .setFirstName(firstName)
                        .setLastName(lastName)
                        .setEmail(email)
                        .chooseGender()
                        .setNumber(phoneNumber);
            });
            step("Set date", () -> {
                registrationPage.calendarComponent.setDateOfBirth("4", "1993", "16");
            });
            step("Set subjects, hobbies, address, state, city and download picture", () -> {
                registrationPage
                        .setSubjects("Arts")
                        .clickHobbiesCheckBox()
                        .downloadPicture()
                        .setAddress(address)
                        .setState("ncr")
                        .setCity("delhi")
                        .pressSubmitButton();
            });
            step("Verify successful form submit", () -> {
                registrationPage.checkResultTable("Student Name", firstName + " " + lastName)
                        .checkResultTable("Student Email", email)
                        .checkResultTable("Gender", "Male")
                        .checkResultTable("Mobile", phoneNumber)
                        .checkResultTable("Date of Birth", "16 May,1993")
                        .checkResultTable("Subjects", "Arts")
                        .checkResultTable("Hobbies", "Reading")
                        .checkResultTable("Picture", "structure.png")
                        .checkResultTable("Address", address)
                        .checkResultTable("State and City", "NCR Delhi");
            });
        });
    }
}