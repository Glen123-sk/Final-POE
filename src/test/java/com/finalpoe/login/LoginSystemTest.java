package com.finalpoe.login;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LoginSystemTest {
    private final LoginSystem loginSystem = new LoginSystem();

    @Test
    void testUsernameValid() {
        assertEquals(
                "Username successfully captured.",
                loginSystem.validateUsername("ab_cd")
        );
    }

    @Test
    void testUsernameInvalid() {
        assertEquals(
                "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters long.",
                loginSystem.validateUsername("abcde")
        );
    }

    @Test
    void testPasswordValid() {
        assertEquals(
                "Password successfully captured.",
                loginSystem.validatePassword("Abc@1234")
        );
    }

    @Test
    void testPasswordInvalid() {
        assertEquals(
                "Password does not meet complexity requirements.",
                loginSystem.validatePassword("abc123")
        );
    }

    @Test
    void testCellValid() {
        assertEquals(
                "Cell phone number successfully captured.",
                loginSystem.validateCellPhoneNumber("+27831234567")
        );
    }

    @Test
    void testCellInvalid() {
        assertEquals(
                "Cell phone number is incorrectly formatted.",
                loginSystem.validateCellPhoneNumber("08123")
        );
    }
}