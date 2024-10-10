package ejercicios.modulo5.vehiculosenalquiler;

public interface VehiculoAlquilable {
    void alquilar (int edad) throws EdadInsuficienteException, ClienteNoValidoException;
    void devolver();
}
