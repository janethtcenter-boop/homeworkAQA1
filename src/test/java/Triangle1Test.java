import org.junit.jupiter.api.Test;

import static com.sun.tools.doclint.Entity.le;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Triangle1Test {
    @Test
    void testAreaValid() {
        double base = 10;
        double height = 5;
        double expected = 25.0;
        double actual = Triangle1.area(base, height);
        assertEquals(expected, actual, le-9, "Площадь должна быть 25");
    }
    @Test
    void testAreaBaseZero() {
        assertThrows(IllegalArgumentException.class, () -> Triangle.area(0, 5));
    }
    @Test
    void testAreaHeightZero() {
        assertThrows(IllegalArgumentException.class, () -> Triangle.area(10, 0));
    }
    @Test
    void testAreaBaseNegative() {
        assertThrows(IllegalArgumentException.class, () -> Triangle.area(-3, 4));

    }
    @Test
    void testAreaHeightNegative() {
        assertThrows(IllegalArgumentException.class, () -> Triangle.area(3, -4));
    }
}
