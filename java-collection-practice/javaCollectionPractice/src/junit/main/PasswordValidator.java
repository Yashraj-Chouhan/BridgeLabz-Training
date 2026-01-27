package junit.passwordvalidator;

public class PasswordValidator {

    public boolean isValid(String password) {

        if (password == null) {
            return false;
        }

        // At least 8 characters, one uppercase letter, one digit
        return password.matches("(?=.*[A-Z])(?=.*\\d).{8,}");
    }
}
