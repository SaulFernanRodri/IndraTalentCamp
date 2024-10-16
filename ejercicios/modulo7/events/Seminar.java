package ejercicios.modulo7.events;

import java.time.LocalDate;

public class Seminar extends Event {

    private String topic;

    public Seminar(String name, LocalDate date, double price, String topic) {
        super(name, date, TypeEvent.SEMINAR, price);
        this.topic = topic;
    }

    public String getTopic() {
        return this.topic;
    }


    @Override
    public void showDetails() {
        System.out.println("Seminario: " + getName());
        System.out.println("Tema: " + getTopic());
        System.out.println("Fecha: " + getDate());
        System.out.println("Precio: " + getPrice());
        System.out.println("Participantes: ");
        for (Participant p : getParticipants()) {
            System.out.println(p.getName());
        }
    }
}
