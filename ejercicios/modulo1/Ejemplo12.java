package ejercicios.modulo1;

import java.util.Scanner;

public class Ejemplo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la distancia en kilómetros: ");
        double kilometros = scanner.nextDouble();

        double millas = kilometros * 0.621371;

        System.out.println("La distancia en millas es: " + millas);
    }
}
