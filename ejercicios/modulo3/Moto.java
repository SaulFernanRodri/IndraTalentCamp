package ejercicios.modulo3;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    // Constructor
    public Moto(String marca, int anho, boolean tieneSidecar) {
        super(marca, anho);
        this.tieneSidecar = tieneSidecar;
    }

    // Getter and Setter
    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    // Overridden method to show details
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}