package tareas.Tarea2;

import java.time.LocalDate;

public class Magazine extends Material {
    private final int issueNumber;

    public Magazine(String title, String author, LocalDate datePublished, String topic, int issueNumber) {
        super(title, author, datePublished, topic);
        this.issueNumber = issueNumber;
    }

    @Override
    public void checkOut() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("The magazine has been borrowed.");
        } else {
            System.out.println("The magazine is already borrowed.");
        }
    }

    @Override
    public void checkIn() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("The magazine has been returned.");
        } else {
            System.out.println("The magazine was not borrowed.");
        }
    }

    @Override
    public boolean isAvailable() {
        System.out.println(isBorrowed ? "The magazine is currently borrowed." : "The magazine is available.");
        return isBorrowed;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println(isBorrowed ? "The magazine is currently borrowed." : "The magazine is available.");
    }
}