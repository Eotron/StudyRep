import java.util.Arrays;
import java.util.Collections;

/**
 * prueba.
 */
public final class Kata1 {
    /**
     *  es un constructor vacio.
     */
    private Kata1() {
    }

    /**
     * metodo para ordenar un numero en forma descendente.
     * @param num  ingresa un numero.
     * @return   retorna numero ordenado descendentemente.
     */
    public static int sortDesc(final int num) {
        String numero = Integer.toString(num);
        String[] cadena = numero.split("");

        Arrays.sort(cadena, Collections.reverseOrder());

        return Integer.parseInt(String.join("", cadena));
    }
}
