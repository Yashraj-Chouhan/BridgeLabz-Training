package junit.passwordvalidator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Password1"));
        assertTrue(validator.isValid("Secure123"));
    }

    @Test
    void testInvalidPasswordTooShort() {
        assertFalse(validator.isValid("Pass1"));
    }

    @Test
    void testInvalidPasswordNoUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    @Test
    void testInvalidPasswordNoDigit() {
        assertFalse(validator.isValid("Password"));
    }

    @Test
    void testNullPassword() {
        assertFalse(validator.isValid(null));
    }
}
