package com.finalpoe.login;

public class LoginSystem {
    private static final String USERNAME_SUCCESS = "Welcome < user first name>,  it is great to see you.";
    private static final String USERNAME_FAILURE = "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
    private static final String PASSWORD_SUCCESS = "Password successfully captured.";
    private static final String PASSWORD_FAILURE = "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
    private static final String CELL_SUCCESS = "Cell phone number successfully captured.";
    private static final String CELL_FAILURE = "Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again.";

    public String validateUsername(String username) {
        if (isUsernameValid(username)) {
            return USERNAME_SUCCESS;
        }
        return USERNAME_FAILURE;
    }

    public boolean isUsernameValid(String username) {
        return username != null && username.contains("_") && username.length() <= 5;
    }

    public String validatePassword(String password) {
        if (!isPasswordValid(password)) {
            return PASSWORD_FAILURE;
        }
        return PASSWORD_SUCCESS;
    }

    public boolean isPasswordValid(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasNumber = false;
        boolean hasSpecialCharacter = false;

        for (int index = 0; index < password.length(); index++) {
            char currentCharacter = password.charAt(index);
            if (Character.isUpperCase(currentCharacter)) {
                hasUppercase = true;
            } else if (Character.isDigit(currentCharacter)) {
                hasNumber = true;
            } else if (!Character.isLetterOrDigit(currentCharacter)) {
                hasSpecialCharacter = true;
            }
        }

        return hasUppercase && hasNumber && hasSpecialCharacter;
    }

    public String validateCellPhoneNumber(String cellPhoneNumber) {
        if (isCellPhoneNumberValid(cellPhoneNumber)) {
            return CELL_SUCCESS;
        }
        return CELL_FAILURE;
    }

    public boolean isCellPhoneNumberValid(String cellPhoneNumber) {
        return cellPhoneNumber != null
                && (cellPhoneNumber.matches("^0\\d{9}$") || cellPhoneNumber.matches("^\\+27\\d{9}$"));
    }

    public boolean login(String username, String password) {
        return isUsernameValid(username) && isPasswordValid(password);
    }
}