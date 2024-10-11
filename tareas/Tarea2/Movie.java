package tareas.Tarea2;

import java.time.LocalDate;

public class Movie extends Material implements IBorrowable {
    private final int duration;
    private boolean isBorrowed;

    public Movie (String title, String author, LocalDate datePublished, String topic, int duration) {
        super(title, author, datePublished, topic);
        this.duration = duration;
        this.isBorrowed = false;
    }

    @Override
    public void checkOut() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("The movie has been borrowed.");
        } else {
            System.out.println("The movie is already borrowed.");
        }
    }

    @Override
    public void checkIn() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("The movie has been returned.");
        } else {
            System.out.println("The movie was not borrowed.");
        }
    }

    @Override
    public void isAvailable() {
        System.out.println(isBorrowed ? "The movie is currently borrowed." : "The movie is available.");
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Duration: " + duration);
        System.out.println(isBorrowed ? "The movie is currently borrowed." : "The movie is available.");
    }
}
