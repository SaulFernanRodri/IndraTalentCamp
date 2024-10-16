package ejercicios.modulo5.transacciones;

public class TransferenciaNacional implements Transaccion{
    
    private final String titular;
    private double saldoDisponible;
    private final double limiteTransferencia;

    public TransferenciaNacional(String titular, double saldoDisponible, double limiteTransferencia){
        this.titular = titular;
        this.saldoDisponible = saldoDisponible;
        this.limiteTransferencia = limiteTransferencia;
    }

    @Override
    public void realizarTransaccion(double monto) throws FondosInsuficientesException{
        //Verificamos si el monto supera el limite de transferencia
        if( monto > limiteTransferencia){
            throw new FondosInsuficientesException("El monto supera el limite de transferencia bancaria");
        }

        if( monto > saldoDisponible){
            throw new FondosInsuficientesException("Fondos insuficientes para realizar la transacción");
        }

        saldoDisponible -= monto;
        System.out.println("Transferencia nacional realiza por $" + monto);
    }


    @Override
    public void mostrarDetalles(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo disponible: $" + saldoDisponible);
        System.out.println("Limite de transferencia: $" + limiteTransferencia);
    }
}
