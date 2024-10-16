package ejercicios.modulo7.events;

import java.time.LocalDate;

public class Concert extends Event {
    private String band;

    public Concert(String name, LocalDate date, String band, double price) {
        super(name, date, TypeEvent.CONCERT, price);
        this.band = band;
    }

    public String getBand() {
        return this.band;
    }

    @Override
    public void showDetails() {
        System.out.println("Concert: " + this.getName());
        System.out.println("Date: " + this.getDate());
        System.out.println("Band: " + this.getBand());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Participants: " + this.getParticipants().size());
    }
}
