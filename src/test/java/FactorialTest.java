import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.compute(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, Factorial.compute( 1));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(100, Factorial.compute(6));
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.compute(-1);
        });
    }
}

