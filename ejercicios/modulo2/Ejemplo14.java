package ejercicios.modulo2;

public class Ejemplo14 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;

        // Search for the target number
        boolean found = false;
        int i = 0;
        while (i < array.length && !found) {
            if (array[i] == target) {
                System.out.println("Number " + target + " found at index " + i);
                found = true;
            }
            i++;
        }

        if (!found) {
            System.out.println("Number " + target + " not found in the array.");
        }
    }
}

