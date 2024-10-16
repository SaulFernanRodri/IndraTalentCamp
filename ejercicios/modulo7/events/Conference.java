package ejercicios.modulo7.events;

import java.time.LocalDate;

public class Conference extends Event {

    private String speaker;

    public Conference(String name, LocalDate date, String speaker, double price) {
        super(name, date, TypeEvent.CONFERENCE, price);
        this.speaker = speaker;
    }

    public String getSpeaker() {
        return this.speaker;
    }

    @Override
    public void showDetails() {
        System.out.println("Conference: " + this.getName());
        System.out.println("Date: " + this.getDate());
        System.out.println("Topic: " + this.getSpeaker());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Participants: " + this.getParticipants().size());
    }
}
