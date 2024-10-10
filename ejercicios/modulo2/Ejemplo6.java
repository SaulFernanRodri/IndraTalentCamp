package ejercicios.modulo2;

import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor inicial del artículo: ");
        double valorInicial = scanner.nextDouble();
        double valorFinal;

        if (valorInicial >= 1000) {
            valorFinal = valorInicial * 0.80; // 20% discount
        } else if (valorInicial >= 500) {
            valorFinal = valorInicial * 0.90; // 10% discount
        } else if (valorInicial >= 100) {
            valorFinal = valorInicial * 0.95; // 5% discount
        } else {
            valorFinal = valorInicial; // No discount
        }

        System.out.println("El valor final del artículo después del descuento es: " + valorFinal);
    }
}

