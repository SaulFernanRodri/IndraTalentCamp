package ejercicios.modulo2;

import java.util.Scanner;

public class Ejemplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota del estudiante: ");
        int nota = scanner.nextInt();

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 80) {
            System.out.println("Notable");
        } else if (nota >= 70) {
            System.out.println("Bien");
        } else if (nota >= 60) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Insuficiente");
        }

    }
}
