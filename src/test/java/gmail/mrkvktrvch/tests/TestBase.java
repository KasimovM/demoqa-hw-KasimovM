package gmail.mrkvktrvch.tests;

import com.codeborne.selenide.Configuration;
import gmail.mrkvktrvch.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
        open("https://demoqa.com/automation-practice-form");
    }

}
