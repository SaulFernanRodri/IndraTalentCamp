package Tareas;

import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese su ciudad de origen: ");
        String ciudad = scanner.nextLine();

        System.out.println("Ingrese una frase personalizada: ");
        String frasePersonalizada = scanner.nextLine();

        String fraseCompleta = "Hola, mi nombre es " + nombre + ", tengo " + edad + " años, soy de " + ciudad + " y " + frasePersonalizada;

        System.out.println(fraseCompleta);
    }
}

