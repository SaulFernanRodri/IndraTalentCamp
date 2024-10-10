package ejercicios.modulo5.transacciones;

public class LimiteTransferenciaException extends Exception{
    public LimiteTransferenciaException(String mensaje){
        super(mensaje);
    }  
}