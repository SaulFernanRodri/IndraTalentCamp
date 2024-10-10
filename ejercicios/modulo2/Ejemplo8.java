package ejercicios.modulo2;

public class Ejemplo8 {

    public static void main(String[] args) {
        String example = "Hello, World!";

        // Length of the string
        int length = example.length();
        System.out.println("Length: " + length);

        // Character at a specific index
        char charAt = example.charAt(0);
        System.out.println("Character at index 0: " + charAt);

        // Substring
        String substring = example.substring(7, 12);
        System.out.println("Substring (7, 12): " + substring);

        // Concatenation
        String concatenated = example.concat(" How are you?");
        System.out.println("Concatenated: " + concatenated);

        // Replace
        String replaced = example.replace("World", "Java");
        System.out.println("Replaced: " + replaced);

        // To Upper Case
        String upperCase = example.toUpperCase();
        System.out.println("Upper Case: " + upperCase);

        // To Lower Case
        String lowerCase = example.toLowerCase();
        System.out.println("Lower Case: " + lowerCase);

        // Trim
        String trimmed = "   Hello, World!   ".trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // Split
        String[] split = example.split(", ");
        System.out.println("Split: ");
        for (String part : split) {
            System.out.println(part);
        }

        // Contains
        boolean contains = example.contains("World");
        System.out.println("Contains 'World': " + contains);

        // Equals
        boolean equals = example.equals("Hello, World!");
        System.out.println("Equals 'Hello, World!': " + equals);

        // Equals Ignore Case
        boolean equalsIgnoreCase = example.equalsIgnoreCase("hello, world!");
        System.out.println("Equals Ignore Case 'hello, world!': " + equalsIgnoreCase);
    }
}