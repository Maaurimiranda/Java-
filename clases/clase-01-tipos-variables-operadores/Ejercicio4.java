package clase1;

import java.math.BigDecimal;

public class Ejercicio4 {

    public static void main(String[] args) {

        double resultadoDouble = 0.1 + 0.2;
        System.out.println("Con double: " + resultadoDouble);

        BigDecimal resultadoBigDecimal =
                new BigDecimal("0.1").add(new BigDecimal("0.2"));

        System.out.println("Con BigDecimal: " + resultadoBigDecimal);

        /*
         * double usa representación binaria de punto flotante.
         * Muchos números decimales, como 0.1 y 0.2, no pueden
         * representarse exactamente en binario, por eso el resultado
         * puede ser 0.30000000000000004.
         *
         * BigDecimal permite representar estos valores decimales
         * con mucha mayor precisión, por eso 0.1 + 0.2 da exactamente 0.3.
         */
    }
}