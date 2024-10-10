package ejercicios.modulo1;

import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args) {
        System.out.println("Ejemplo 6");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese un texto ");
        String texto = scanner.nextLine();

        System.out.println("El numero ingresado es: "+ num1);
        System.out.println("El texto ingresado es: "+ texto);
    }
}
