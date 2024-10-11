package tareas.Tarea2;

import java.util.ArrayList;

public class Client extends Person {
    private final String clientId;
    private final ArrayList<Book> borrowedBooks;

    public Client(String name, int age, String clientId) {
        super(name, age);
        this.clientId = clientId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        book.checkOut();
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        book.checkIn();
    }

    private void showBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            book.showDetails();
        }
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Client ID: " + clientId);
        showBorrowedBooks();
    }
}