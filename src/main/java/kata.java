import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
/**
 * In this little assignment you are given a string
 * of space separated numbers,
 * and have to return the highest and lowest number.
 * HighAndLow("1 2 3 4 5")  // return "5 1"
 * HighAndLow("1 2 -3 4 5") // return "5 -3"
 * HighAndLow("1 9 3 4 -5") // return "9 -5"
 */

public class kata {

    /**
     * Metodo para sacar numeros altos y numeros bajos
     *
     * @param numbers . En este parametro se ingresa una cadena
     *                separado por espacios
     * @return
     *          Devuelve el mayor y el menos Highest and lowest
     *
     */

    public static String HighAndLow(String numbers) {
        String[] cadena=numbers.split(" ");
        float mayor=Float.parseFloat(cadena[0]);
        float menor=Float.parseFloat(cadena[0]);
        for (int i=1;i<=(cadena.length-1);++i)
        {
            if (Float.parseFloat(cadena[i])>mayor)
            {
                mayor=Float.parseFloat(cadena[i]);
            }
            if (Float.parseFloat(cadena[i])<menor)
            {
                menor=Float.parseFloat(cadena[i]);
            }
        }
        DecimalFormat formato = new DecimalFormat("#");
        return (formato.format(mayor))+" "+formato.format(menor);
    }
}
