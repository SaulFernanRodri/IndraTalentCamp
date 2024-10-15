package ejercicios.modulo6.concesionario;

import java.util.Date;

public class Transaccion {
    
    private final Cliente cliente;
    private final Vendedor vendedor;
    private final Auto auto;
    private final Date fecha;

    public Transaccion(Cliente cliente, Vendedor vendedor, Auto auto){
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.auto = auto;
        this.fecha = new Date(); 
    }

    public void mostrarDetalles(){
        System.out.println("Transaccion realizada: ");
        cliente.mostrarDetalles();
        vendedor.mostrarDetalles();
        auto.mostrarDetalles();
        System.out.println("Fecha de la transacción: " + fecha);
    }

}
