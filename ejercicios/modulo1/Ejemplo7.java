package ejercicios.modulo1;

import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);


        System.out.println("El área del círculo es: " + area);
    }
}
