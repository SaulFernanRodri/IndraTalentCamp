package ejercicios.modulo2;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ejemplo12 {

    public static void main(String[] args) {
        // Current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        // Specific time
        LocalTime specificTime = LocalTime.of(14, 30, 15);
        System.out.println("Specific time: " + specificTime);

        // Parsing time from string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime parsedTime = LocalTime.parse("14:30:15", formatter);
        System.out.println("Parsed time: " + parsedTime);

        // Formatting time to string
        String formattedTime = currentTime.format(formatter);
        System.out.println("Formatted time: " + formattedTime);

        // Adding hours to a time
        LocalTime timePlusHours = currentTime.plusHours(2);
        System.out.println("Time after adding 2 hours: " + timePlusHours);

        // Subtracting minutes from a time
        LocalTime timeMinusMinutes = currentTime.minusMinutes(30);
        System.out.println("Time after subtracting 30 minutes: " + timeMinusMinutes);

        // Getting the hour of the time
        int hour = currentTime.getHour();
        System.out.println("Hour: " + hour);

        // Getting the minute of the time
        int minute = currentTime.getMinute();
        System.out.println("Minute: " + minute);

        // Comparing two times
        boolean isBefore = specificTime.isBefore(currentTime);
        boolean isAfter = specificTime.isAfter(currentTime);
        System.out.println("Is specific time before current time: " + isBefore);
        System.out.println("Is specific time after current time: " + isAfter);



        Duration duration = Duration.between(specificTime, currentTime);
        // Get the difference in hours, minutes, and seconds
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        System.out.println("Difference: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
