import org.junit.Test;
import java.util.Arrays;

import static org.junit.Assert.*;
public class kataTest {
    /**
     *  final int expected = 6541;
     *         final int num = 1654;
     *         assertEquals(expected, Kata1.sortDesc(num));
     */
    @Test
    public void Test() {
      //  System.out.println("hola "+kata.HighAndLow("-7 3 43 2 0"));

       assertEquals("42 -9", kata.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
