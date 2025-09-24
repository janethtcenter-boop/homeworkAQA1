import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberComparatorTest {
    private final NumberComparator comparator = new NumberComparator();
    @Test
    public void testCompareFirstGreater() {
        assertEquals(1, comparator.compare(5, 3));
    }
    @Test
    public void testCompareEqual() {
        assertEquals(0, comparator.compare(4, 4));
    }
    @Test
    public void testCompareSecondGreater() {
        assertEquals(-1, comparator.compare (2, 7));
    }
}
    

