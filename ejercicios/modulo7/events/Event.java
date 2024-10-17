package ejercicios.modulo7.events;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Event {
    private String name;
    private LocalDate date;
    private TypeEvent type;
    private double price;
    private ArrayList<Participant> participants;

    public Event(String name, LocalDate date, TypeEvent type, double price) {
        this.name = name;
        this.date = date;
        this.type = type;
        this.price = price;
        participants = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TypeEvent getType() {
        return type;
    }

    public void setType(TypeEvent type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(ArrayList<Participant> participants) {
        this.participants = participants;
    }

    public abstract void showDetails();

    public void addParticipant(Participant participant) {
        try{
            if (!participant.isAvailable(this)) {
                throw new InscriptionNotPermitedException("No se pueden inscribir");
            }
            participants.add(participant);
            participant.addEvent(this);
        } catch (InscriptionNotPermitedException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", type=" + type +
                ", price=" + price +
                ", participants=" + participants +
                '}';
    }
}
