package gmail.mrkvktrvch.tests;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestingPracticeForm extends TestData {

    @Test
    void registrationTest() {
        open("https://demoqa.com/automation-practice-form");
        registrationPage
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .chooseGender()
                .setNumber(phoneNumber);
        registrationPage.calendarComponent.setDateOfBirth("4", "1993", "16");
        registrationPage
                .setSubjects("Arts")
                .clickHobbiesCheckBox()
                .downloadPicture()
                .setAddress(address)
                .setState("ncr")
                .setCity("delhi")
                .pressSubmitButton();
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
    }
}