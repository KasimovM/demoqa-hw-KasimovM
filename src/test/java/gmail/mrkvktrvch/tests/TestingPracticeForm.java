package gmail.mrkvktrvch.tests;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.UploadFile;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestingPracticeForm extends TestBase {

    @Test
    void registrationTest() {
        registrationPage
                .openPage()
                .setFirstName("Mark")
                .setLastName("Kasimov")
                .setEmail("mrkvktrvch@gmail.com")
                .chooseGender().setNumber("1234567890");
        registrationPage.calendarComponent.setDateOfBirth("4", "1993", "16");
        registrationPage
                .setSubjects("Arts")
                .clickHobbiesCheckBox()
                .downloadPicture()
                .setAddress("Saint-Petersburg")
                .setState("ncr")
                .setCity("delhi")
                .pressSubmitButton();
    }


}
