package ejercicios.modulo4.GestionCuentasBancarias;

public class FondosInsuficientesException extends Exception{
    public FondosInsuficientesException(String mensaje){
        super(mensaje);
    }
}
