package ejercicios.modulo2;
import java.util.Arrays;


public class Ejemplo10 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Length of the array
        int length = array.length;
        System.out.println("Length: " + length);

        // Accessing elements
        int firstElement = array[0];
        System.out.println("First element: " + firstElement);

        // Modifying elements
        array[0] = 10;
        System.out.println("Modified first element: " + array[0]);

        // Iterating over elements
        System.out.print("Array elements: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();


        // Copying an array
        int[] copiedArray = new int[array.length];
        System.arraycopy(array, 0, copiedArray, 0, array.length);
        System.out.print("Copied array: ");
        for (int element : copiedArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Copying an array using a loop
        for (int i = 0; i < array.length; i++) {
            copiedArray[i] = array[i];
        }
        System.out.print("Copied array: ");
        for (int element : copiedArray) {
            System.out.print(element + " ");
        }
        System.out.println();


        // Sorting an array using bubble sort
        bubbleSort(array);
        System.out.print("Sorted array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Sorting an array
        Arrays.sort(array);
        System.out.print("Sorted array: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();


        // Searching in an array using linear search
        int index = linearSearch(array, 3);
        System.out.println("Index of element 3: " + index);

        // Searching in an array
        index = Arrays.binarySearch(array, 3);
        System.out.println("Index of element 3: " + index);


        // Filling an array using a loop
        fillArray(array, 0);
        System.out.print("Array after fill: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Filling an array
        Arrays.fill(array, 0);
        System.out.print("Array after fill: ");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

    }

    // Bubble sort implementation
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Linear search implementation
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1; // Element not found
    }

    // Fill array implementation
    public static void fillArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }
}