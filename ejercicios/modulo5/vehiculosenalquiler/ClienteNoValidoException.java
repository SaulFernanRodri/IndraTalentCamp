package ejercicios.modulo5.vehiculosenalquiler;

public class ClienteNoValidoException extends Exception{
    public ClienteNoValidoException(String mensaje){
        super(mensaje);
    }
}
