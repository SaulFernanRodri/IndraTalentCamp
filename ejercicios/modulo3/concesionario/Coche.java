package ejercicios.modulo3.concesionario;

public class Coche extends Vehiculo {
    private int numPuertas;

    // Constructor
    public Coche(String marca, int anho, int numPuertas) {
        super(marca, anho);
        this.numPuertas = numPuertas;
    }

    // Getter and Setter
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    // Overridden method to show details
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de puertas: " + numPuertas);
    }
}