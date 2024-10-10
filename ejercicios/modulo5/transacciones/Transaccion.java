package ejercicios.modulo5.transacciones;

public interface Transaccion {
    void realizarTransaccion(double monto) throws FondosInsuficientesException, LimiteTransferenciaException;
    void mostrarDetalles();
}
