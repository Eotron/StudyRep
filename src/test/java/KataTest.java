import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Este es una clase de prueba.
 */
public class KataTest {
    /**
     * primera frase jejeje.
     *  final int expected = 6541;
     *         final int num = 1654;
     *         assertEquals(expected, Kata1.sortDesc(num));
     */
    @Test
    public void test() {
      //  System.out.println("hola "+kata.HighAndLow("-7 3 43 2 0"));

       assertEquals("42 -9", Kata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
