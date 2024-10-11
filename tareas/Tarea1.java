package tareas;

import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter your hometown: ");
        String hometown = scanner.nextLine();

        System.out.println("Enter a personalized phrase: ");
        String personalizedPhrase = scanner.nextLine();

        String completePhrase = "Hello, my name is " + name + ", I am " + age + " years old, I am from " + hometown + " and " + personalizedPhrase;

        System.out.println(completePhrase);
    }
}
