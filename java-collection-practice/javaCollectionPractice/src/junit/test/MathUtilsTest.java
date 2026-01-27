package junit.mathutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    MathUtils mathUtils = new MathUtils();

    @Test
    void testDivideByZeroException() {

        assertThrows(ArithmeticException.class, () -> {
            mathUtils.divide(10, 0);
        });
    }

    @Test
    void testDivideSuccessfully() {
        assertEquals(5, mathUtils.divide(10, 2));
    }
}
