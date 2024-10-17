package ejercicios.modulo7.events;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class EventPlanner {
    private ArrayList<Event> events;
    private ArrayList<Participant> participants;

    public EventPlanner() {
        events = new ArrayList<>();
        participants = new ArrayList<>();
    }


    public void addEvent() {
        String tipo = JOptionPane.showInputDialog("Ingrese el tipo de evento: ");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del evento: ");
        LocalDate fecha = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha del evento: "));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del evento: "));

        if (tipo.equalsIgnoreCase("SEMINAR")) {
            String topic = JOptionPane.showInputDialog("Ingrese el tema del seminario: ");
            Seminar sem = new Seminar(nombre, fecha, precio, topic);
            events.add(sem);
        } else if (tipo.equalsIgnoreCase("CONFERENCE")) {
            String speaker = JOptionPane.showInputDialog("Ingrese el speaker de la conferencia: ");
            Conference conf = new Conference(nombre, fecha, speaker, precio);
            events.add(conf);

        } else if (tipo.equalsIgnoreCase("CONCERT")) {
            String artist = JOptionPane.showInputDialog("Ingrese el artista del concierto: ");
            Concert conc = new Concert(nombre, fecha, artist, precio);
            events.add(conc);
        }

        System.out.println("Evento agregado exitosamente");
    }

    public void addParticipant() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del participante: ");
        String email = JOptionPane.showInputDialog("Ingrese el email del participante: ");
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el balance del participante: "));

        Participant p = new Participant(nombre, email, balance);
        participants.add(p);
        System.out.println("Participante agregado exitosamente");

        String nombreEvento = JOptionPane.showInputDialog("Ingrese el nombre del evento: ");
        Event ev = searchEvent(nombreEvento);

        if (ev != null) {
            if (p.isAvailable(ev)) {
                p.addEvent(ev);
                ev.getParticipants().add(p);
                System.out.println("Participante agregado al evento exitosamente");
            } else {
                System.out.println("El participante no tiene suficiente balance para el evento");
            }
        } else {
            System.out.println("Evento no encontrado");
        }
    }

    public Event searchEvent(String name) {
        for (Event e : events) {
            if (e.getName().equalsIgnoreCase(name)) {
                return e;
            }
        }
        return null;
    }

    public Participant searchParticipants(String name) {
        for (Participant p : participants) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public void showEvents() {
        for (Event e : events) {
            e.showDetails();
        }
    }

    public void showParticipants() {
        for (Participant p : participants) {
            p.toString();
        }
    }

}
