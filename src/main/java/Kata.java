import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * In this little assignment you are given a string
 * of space separated numbers,
 * and have to return the highest and lowest number.
 * HighAndLow("1 2 3 4 5")  // return "5 1"
 * HighAndLow("1 2 -3 4 5") // return "5 -3"
 * HighAndLow("1 9 3 4 -5") // return "9 -5".
 */

public final class Kata {
    /**
     * es un constructor vacio.
     */
    private Kata() {
    }

    /**
     * Metodo para sacar numeros altos y numeros bajos.
     *
     * @param numbers . En este parametro se ingresa una cadena
     *                separado por espacios.
     * @return Devuelve el mayor y el menos Highest and lowest.
     */

    public static String highAndLow(final String numbers) {
        String[] cadena = numbers.split(" ");
        int mayor = 0;
        int menor = 0;
        for (String item : cadena) {
            int aux = Integer.parseInt(item);
            if (aux > mayor) {
                mayor = aux;
            }
            if (aux < menor) {
                menor = aux;
            }
        }
        return String.format("%s %s", mayor, menor);
    }
}
