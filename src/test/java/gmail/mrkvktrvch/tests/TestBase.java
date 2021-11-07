package gmail.mrkvktrvch.tests;

import com.codeborne.selenide.Configuration;
import gmail.mrkvktrvch.pages.RegistrationPage;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

}
