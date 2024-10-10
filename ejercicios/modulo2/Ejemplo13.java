package ejercicios.modulo2;

public class Ejemplo13 {

    public static void main(String[] args) {
        // Creating a 2D array (matrix) with 3 rows and 4 columns
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Accessing elements in the 2D array
        System.out.println("Element at row 1, column 2: " + matrix[1][2]);

        // Iterating over the 2D array
        System.out.println("Matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Getting the number of rows
        int rows = matrix.length;
        System.out.println("Number of rows: " + rows);

        // Getting the number of columns in the first row
        int columns = matrix[0].length;
        System.out.println("Number of columns in the first row: " + columns);

        // Creating a 3D array
        int[][][] cube = new int[2][3][4];

        // Setting values in the 3D array
        cube[0][0][0] = 1;
        cube[1][2][3] = 2;

        // Accessing elements in the 3D array
        System.out.println("Element at cube[0][0][0]: " + cube[0][0][0]);
        System.out.println("Element at cube[1][2][3]: " + cube[1][2][3]);

        // Sum of all elements in the 2D array
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);

        // Finding the maximum element in the 2D array
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum element: " + max);

        // Transposing the 2D array
        int[][] transpose = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transposed matrix:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}