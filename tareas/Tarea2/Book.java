package tareas.Tarea2;

import java.time.LocalDate;

public class Book extends Material implements IBorrowable {
    private final int numberOfPages;
    private boolean isBorrowed;

    public Book(String title, String author, LocalDate datePublished, String topic, int numberOfPages) {
        super(title, author, datePublished, topic);
        this.numberOfPages = numberOfPages;
        this.isBorrowed = false;
    }

    @Override
    public void checkOut() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("The book has been borrowed.");
        } else {
            System.out.println("The book is already borrowed.");
        }
    }

    @Override
    public void checkIn() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("The book has been returned.");
        } else {
            System.out.println("The book was not borrowed.");
        }
    }

    @Override
    public void isAvailable() {
        System.out.println(isBorrowed ? "The book is currently borrowed." : "The magazine is available.");
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Number of Pages: " + numberOfPages);
        System.out.println(isBorrowed ? "The book is currently borrowed." : "The book is available.");
    }
}

