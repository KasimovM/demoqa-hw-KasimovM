package gmail.mrkvktrvch;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.commands.UploadFile;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class TestingPracticeForm {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void registrationTest() {
    open("https://demoqa.com/automation-practice-form");
    $("#firstName").setValue("Mark");
    $("#lastName").setValue("Kasimov");
    $("#userEmail").setValue("mrkvktrvch@gmail.com");
    $$(".custom-radio").first().click();
    $("#userNumber").setValue("1234567890");
    $("#dateOfBirthInput").click();
    $(".react-datepicker__month-select").selectOptionByValue("4");
    $(".react-datepicker__year-select").selectOptionByValue("1993");
    $$(".react-datepicker__day").find(text("16")).click();
    $("#subjectsInput").setValue("Arts").pressEnter();
    $("[for=hobbies-checkbox-2").click();
    $("#uploadPicture").uploadFromClasspath("structure.png");
    $("#currentAddress").setValue("Saint-Petersburg");
    $("#react-select-3-input").setValue("ncr").pressEnter();
    $("#react-select-4-input").setValue("delhi").pressEnter();









    }


}
