package ejercicios.modulo1;

import java.util.Scanner;

public class Ejemplo9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una oración: ");
        String oracion = scanner.nextLine();

        System.out.println("La oración ingresada es :\n" + oracion);
    }
}
