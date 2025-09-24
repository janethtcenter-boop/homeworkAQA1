import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComparatorTest {
    @Test
    public void testEqualNumbers() {
        Assertions Assert = null;
        Assertions.assertEquals(0, Comparator.compare(5, 5));
    }
    @Test
    public void testFirstLessThanSecond() {
        Assertions Assert = null;
        Assertions.assertTrue(Comparator.compare(3, 7) < 0 );
    }
    @Test
    public void testFirstGreaterThanSecond() {
        Assertions Assert = null;
        Assertions.assertTrue(Comparator.compare(10, 2) > 0);
    }
}
