package ejercicios.modulo7.events;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        EventPlanner eventPlanner = new EventPlanner();

        Map<Integer, Consumer<Void>> menu = new HashMap<>();

        menu.put(1, v -> eventPlanner.addEvent());
        menu.put(2, v -> eventPlanner.addParticipant());
        menu.put(3, v -> eventPlanner.showEvents());
        menu.put(4, v -> eventPlanner.showParticipants());

        int option = 0;

        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("Menú de eventos:\n" + "1. Agregar evento\n" + "2. Agregar participante\n" + "3. Mostrar eventos\n" + "4. Mostrar participantes\n" + "5. Salir\n" + "Seleccione una opción:"));
            if (option >= 1 && option <= 4) {
                menu.get(option).accept(null);
            } else if (option == 5) {
                System.out.println("Saliendo del sistema");
            } else {
                System.out.println("Opción no válida");
            }
        }while(option != 5);

    }
}
