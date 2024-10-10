package ejercicios.modulo3;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Toyota", 2021);
        Coche coche = new Coche("Ford", 2020, 4);
        Moto moto = new Moto("Harley-Davidson", 2019, true);

        // Polymorphism in action
        Vehiculo[] vehiculos = {vehiculo, coche, moto};
        for (Vehiculo v : vehiculos) {
            v.mostrarDetalles();
            System.out.println();
        }
    }
}
