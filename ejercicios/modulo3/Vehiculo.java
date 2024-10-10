package ejercicios.modulo3;

public class Vehiculo implements IVehiculo {
    private String marca;
    private int anho;

    // Constructor
    public Vehiculo(String marca, int anho) {
        this.marca = marca;
        this.anho = anho;
    }


    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int getAnho() {
        return anho;
    }

    @Override
    public void setAnho(int anho) {
        this.anho = anho;
    }

    // Métodos de la interfaz
    @Override
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca + ", Año: " + anho);
    }
}
