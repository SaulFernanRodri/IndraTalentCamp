package ejercicios.modulo5.transacciones;

public class FondosInsuficientesException extends Exception{
    public FondosInsuficientesException(String mensaje){
        super(mensaje);
    }
}
