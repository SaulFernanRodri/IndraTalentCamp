package ejercicios.modulo7.events;

import java.util.ArrayList;

public class Participant {
    private String name;
    private String email;
    private double balance;
    private ArrayList<Event> events;


    public Participant(String name, String email, double balance) {
        this.name = name;
        this.email = email;
        this.balance = balance;
        events = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isAvailable(Event event) {
        return balance > event.getPrice();
    }

    public void addEvent(Event event) {
        events.add(event);
        balance -= event.getPrice();
    }

    @Override
    public String toString() {
        return name + " (" + email + ")";
    }
}
