package gmail.mrkvktrvch;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

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




    }


}
