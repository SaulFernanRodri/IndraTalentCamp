package ejercicios.modulo1;

import java.util.Scanner;


public class Ejemplo14 {
    public static void main(String[] args) {
        System.out.println("Ejemplo 14");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una letra: ");
        String cadena = scanner.nextLine();
        char letra = cadena.charAt(0);
        char letraFinal = cadena.charAt(cadena.length()-1);

        System.out.println("La letra ingresada es: " + letra);
        System.out.println("La ultima letras es: " + letraFinal);

    }
}
