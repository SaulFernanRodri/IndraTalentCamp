
package ejercicios.modulo2;

import java.util.Scanner;

public class Ejemplo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 7: ");
        int numero = scanner.nextInt();

        String dia = switch (numero) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Número inválido. Por favor ingrese un número del 1 al 7.";
        };

        System.out.println(dia);
    }
}
