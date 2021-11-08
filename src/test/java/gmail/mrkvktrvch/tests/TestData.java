package gmail.mrkvktrvch.tests;

import com.github.javafaker.Faker;

public class TestData extends TestBase {

        Faker faker = new Faker();
        public String firstName = faker.name().firstName();
        public String lastName = faker.name().lastName();
        public String email = faker.internet().emailAddress();
        public String address = faker.address().streetAddress();
        public String phoneNumber = faker.number().digits(10);
}


