import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void testAreaValidInput() {
        Assertions Assert = null;
        Assert.assertEquals(25.0, Triangle.area(10, 5));
        Assert.assertEquals(7.0, Triangle.area(3.5, 4.0));
    }
    @Test
    public void testAreaWithZeroBase() {
        Triangle.area(0, 5);
    }
    @Test
    public void testAreaWithNegativeHeight() {
        Triangle.area(10, -3);
    }
}
