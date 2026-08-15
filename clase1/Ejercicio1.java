package clase1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1 - Descomponer en segundos");

        Scanner scanner  = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de segundos: ");
        // Obtenemos segundos
        long segundos = scanner.nextLong();
        long w = segundos % 60;

        //Obtenemos minutos
        long minutos = segundos / 60;
        long z = minutos % 60;

        // Obtenemo horas
        long horas = minutos / 60;
        long y = horas % 24;

        // Obtenemos dias
        long dias =  horas / 24;
        long x = dias;

        System.out.println(x + " dias, " + y + " horas, " + z + " minutos, " + w + " segundos.");
        scanner.close();
    }
}
