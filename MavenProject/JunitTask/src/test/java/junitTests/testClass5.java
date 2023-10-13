package junitTests;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.*;

public class testClass5 {

    @DisplayName("Add test")

    @RepeatedTest(value = 2, name = RepeatedTest.LONG_DISPLAY_NAME)
    void addNum(){
        int n1 = 1, n2 = 9;
        int add = n1 + n2;
        System.out.println("Your result: " + add);
    }

    @Test
    @Tag("unit")

    void checkPassword(){
        String name = "Duaa";
        System.out.println("\nYour name: " + name);

        String password = "Duaa123";
        System.out.println("\nYour password: " + password);

        String expectedPassword = "Duaa123";

        Assertions.assertTrue(expectedPassword.equals(password));

    }

    @Test
    @Disabled
    void checkData(){
        String email = "duaashahid01@gmail.com"; //expected
        String password = "12345";

        String inputEmail = "duaashahid01@gmail.com";
        String inputPass = "12345";

        Assertions.assertAll(
                () -> Assertions.assertTrue(email.equals(inputEmail), "The username is correct"),
                () -> Assertions.assertTrue(password.equals(inputPass), "The password is valid")
        );

    }

    @Test

    void checkValue(){

        Map<String, String> map = new HashMap<>();
        map.put("A01", "Duaa");
        map.put("A02", "Noor");

        assertThat(map, hasKey("A02"));
        assertThat(map, hasValue("Noor"));
        assertThat(map, notNullValue());

    }

    @Test

    void getData(){
        List<String> verticals = Arrays.asList(
                "EmumbaQA",
                "EmumbaFrontEnd",
                "EmumbaBackEnd"
        );

        assertThat(verticals, hasItem("Emumba"));


    }

    @Test
    void getData1(){
        List<String> verticals = Arrays.asList(
                "EmumbaQA",
                "EmumbaFrontEnd",
                "EmumbaBackEnd"
        );
        assertThat(verticals, anyOf(hasItem("Emumba"), hasItem("EmumbaFrontEnd")));
    }
}
