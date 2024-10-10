package ejercicios.modulo5.gestioncuentasbancarias;

public class FondosInsuficientesException extends Exception{
    public FondosInsuficientesException(String mensaje){
        super(mensaje);
    }
}
