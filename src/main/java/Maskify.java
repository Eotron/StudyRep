import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
public class Maskify {
    public static String maskify(String str) {
        String[] cadena=str.split("");
        if (str.length() >= 5){
            for (int i = 0; i <= str.length()-5; i++) {
                cadena[i]="#";
            }
        }
        //investigar que es throw new UnsupportedOperationException("Unimplemented");
        //String pCad = StringUtils.join(cadena);
        String UnionCadena="";
        for (int i = 0; i <str.length() ; i++) {
            UnionCadena=UnionCadena.concat(cadena[i]);
        }
    return UnionCadena;
    }
}
