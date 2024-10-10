package ejercicios.modulo4.gestioncuentasbancarias;

public class FondosInsuficientesException extends Exception{
    public FondosInsuficientesException(String mensaje){
        super(mensaje);
    }
}
