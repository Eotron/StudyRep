import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * test.
 */
public class Kata1Test {

    /**
     * es un metodo.
     */
    @Test
    public void sortDesc() {

        final int expected = 6541;
        final int num = 1654;
        assertEquals(expected, Kata1.sortDesc(num));
    }
}
