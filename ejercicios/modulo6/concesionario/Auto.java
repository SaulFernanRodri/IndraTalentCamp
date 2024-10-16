package ejercicios.modulo6.concesionario;

public class Auto {

    private final String marca;
    private final String modelo;
    private final double precio;

    public Auto(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }
    public double getPrecio(){
        return precio;
    }

    //Metodo para mostrar detalles
    public void mostrarDetalles(){
        System.out.println("Auto: " + marca + " " + modelo + " - Precio: $" + precio);
    }
}
