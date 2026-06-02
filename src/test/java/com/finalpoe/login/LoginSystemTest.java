package com.finalpoe.login;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LoginSystemTest {
    private final LoginSystem loginSystem = new LoginSystem();

    @Test
    void testUsernameValid() {
        assertEquals(
                "Welcome < user first name>,  it is great to see you.",
                loginSystem.validateUsername("Kyl_1")
        );
    }

    @Test
    void testUsernameInvalid() {
        assertEquals(
                "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.",
                loginSystem.validateUsername("kyle!!!!!!")
        );
    }

    @Test
    void testPasswordValid() {
        assertEquals(
                "Password successfully captured.",
                loginSystem.validatePassword("Ch&&sec@ke99!")
        );
    }

    @Test
    void testPasswordInvalid() {
        assertEquals(
                "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.",
                loginSystem.validatePassword("password")
        );
    }

    @Test
    void testCellValid() {
        assertEquals(
                "Cell phone number successfully captured.",
                loginSystem.validateCellPhoneNumber("+27838968976")
        );
    }

    @Test
    void testCellInvalid() {
        assertEquals(
                "Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again.",
                loginSystem.validateCellPhoneNumber("08966553")
        );
    }

    @Test
    void testLoginValid() {
        assertEquals(true, loginSystem.login("Kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    void testLoginInvalid() {
        assertEquals(false, loginSystem.login("kyle!!!!!!", "password"));
    }

    @Test
    void testUsernameBooleanValid() {
        assertEquals(true, loginSystem.isUsernameValid("Kyl_1"));
    }

    @Test
    void testUsernameBooleanInvalid() {
        assertEquals(false, loginSystem.isUsernameValid("kyle!!!!!!"));
    }

    @Test
    void testPasswordBooleanValid() {
        assertEquals(true, loginSystem.isPasswordValid("Ch&&sec@ke99!"));
    }

    @Test
    void testPasswordBooleanInvalid() {
        assertEquals(false, loginSystem.isPasswordValid("password"));
    }

    @Test
    void testCellBooleanValid() {
        assertEquals(true, loginSystem.isCellPhoneNumberValid("+27838968976"));
    }

    @Test
    void testCellBooleanInvalid() {
        assertEquals(false, loginSystem.isCellPhoneNumberValid("08966553"));
    }
}