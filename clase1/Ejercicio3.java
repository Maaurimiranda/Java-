package clase1;

import java.util.Scanner;

public class Ejercicio3  {
    public static void main(String[] args) {
        System.out.println("Ingresar nombre");
        Scanner sc = new Scanner(System.in);

        String nombre = sc.nextLine();

        System.out.println("Ingresar edad");
        int edad = sc.nextInt();

        System.out.print("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();

        System.out.print("¿Es estudiante? (true/false): ");
        boolean estudiante = sc.nextBoolean();

        System.out.println("\n--- FICHA DE USUARIO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.printf("Altura: %.2f metros%n", altura);
        System.out.println("Estudiante: " + estudiante);

        sc.close();
    }
}