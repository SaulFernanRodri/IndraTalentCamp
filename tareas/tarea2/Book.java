package tareas.tarea2;

import java.time.LocalDate;

public class Book extends Material implements IBorrowable {
    private final int pageCount;

    public Book(String title, String author, LocalDate datePublished, String topic, int pageCount) {
        super(title, author, datePublished, topic);
        this.pageCount = pageCount;
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
    public boolean isAvailable() {
        System.out.println(isBorrowed ? "The book is currently borrowed." : "The book is available.");
        return isBorrowed;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Page Count: " + pageCount);
        System.out.println(isBorrowed ? "The book is currently borrowed." : "The book is available.");
    }
}