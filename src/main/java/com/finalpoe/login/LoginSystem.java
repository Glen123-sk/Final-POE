package com.finalpoe.login;

public class LoginSystem {
    private static final String USERNAME_SUCCESS = "Username successfully captured.";
    private static final String USERNAME_FAILURE = "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters long.";
    private static final String PASSWORD_SUCCESS = "Password successfully captured.";
    private static final String PASSWORD_FAILURE = "Password does not meet complexity requirements.";
    private static final String CELL_SUCCESS = "Cell phone number successfully captured.";
    private static final String CELL_FAILURE = "Cell phone number is incorrectly formatted.";

    public String validateUsername(String username) {
        if (username != null && username.contains("_") && username.length() <= 5) {
            return USERNAME_SUCCESS;
        }
        return USERNAME_FAILURE;
    }

    public String validatePassword(String password) {
        if (password == null || password.length() < 8) {
            return PASSWORD_FAILURE;
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

        if (hasUppercase && hasNumber && hasSpecialCharacter) {
            return PASSWORD_SUCCESS;
        }
        return PASSWORD_FAILURE;
    }

    public String validateCellPhoneNumber(String cellPhoneNumber) {
        if (cellPhoneNumber != null && (cellPhoneNumber.matches("^0\\d{9}$") || cellPhoneNumber.matches("^\\+27\\d{9}$"))) {
            return CELL_SUCCESS;
        }
        return CELL_FAILURE;
    }
}