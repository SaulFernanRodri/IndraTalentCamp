package ejercicios.modulo1;


import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String[] args) {

        System.out.println("Ejemplo 8");


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura en ºC");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " ºC son " + fahrenheit + " ºF");


    }
}
