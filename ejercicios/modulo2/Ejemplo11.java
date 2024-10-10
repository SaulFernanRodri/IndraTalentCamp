package ejercicios.modulo2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ejemplo11 {

    public static void main(String[] args) {
        // Current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        // Specific date
        LocalDate specificDate = LocalDate.of(2023, 10, 1);
        System.out.println("Specific date: " + specificDate);

        // Parsing date from string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate parsedDate = LocalDate.parse("01/10/2023", formatter);
        System.out.println("Parsed date: " + parsedDate);

        // Formatting date to string
        String formattedDate = currentDate.format(formatter);
        System.out.println("Formatted date: " + formattedDate);

        // Adding days to a date
        LocalDate datePlusDays = currentDate.plusDays(10);
        System.out.println("Date after adding 10 days: " + datePlusDays);

        // Subtracting days from a date
        LocalDate dateMinusDays = currentDate.minusDays(10);
        System.out.println("Date after subtracting 10 days: " + dateMinusDays);

        // Getting the day of the week
        System.out.println("Day of the week: " + currentDate.getDayOfWeek());

        // Getting the day of the year
        System.out.println("Day of the year: " + currentDate.getDayOfYear());

        // Checking if a year is a leap year
        System.out.println("Is leap year: " + currentDate.isLeapYear());

        // Comparing two dates
        boolean isBefore = specificDate.isBefore(currentDate);
        boolean isAfter = specificDate.isAfter(currentDate);
        System.out.println("Is specific date before current date: " + isBefore);
        System.out.println("Is specific date after current date: " + isAfter);

        // Calculating the difference between two dates
        long daysBetween = ChronoUnit.DAYS.between(specificDate, currentDate);
        System.out.println("Days between specific date and current date: " + daysBetween);
    }
}
