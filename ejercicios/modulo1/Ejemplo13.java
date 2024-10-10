package ejercicios.modulo1;


import java.util.Scanner;

public class Ejemplo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Su IMC es: " + imc);
    }
}
