package ejercicios.modulo2;

import java.util.Scanner;

public class Ejemplo15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "password123";
        int attempts = 3;
        boolean accessGranted = false;

        while (attempts > 0 && !accessGranted) {
            System.out.print("Enter your password: ");
            String inputPassword = scanner.nextLine();

            if (inputPassword.equals(correctPassword)) {
                System.out.println("Access granted.");
                accessGranted = true;
            } else {
                attempts--;
                System.out.println("Incorrect password. You have " + attempts + " attempt(s) left.");
            }

            if (attempts == 0 && !accessGranted) {
                System.out.println("Access denied. No attempts left.");
            }
        }

        scanner.close();
    }
}
