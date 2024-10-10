package ejercicios.modulo4.paymentgateway;

import java.util.ArrayList;
import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        IPayment payment1 = new PaymentCardDebit("1", "1234567890123456", "John Doe");
        IPayment payment2 = new PaymentCardCredit("2", "1234567890123456", "Jane Doe");
        IPayment payment3 = new PaymentPaypal("3", "aaaaaaaa@gmail.com");

        //IPayment payments[] = {payment1, payment2, payment3};
        ArrayList<IPayment> payments = new ArrayList<>();
        payments.add(payment1);
        payments.add(payment2);
        payments.add(payment3);

        for (IPayment payment : payments) {
            payment.pay(round(1000 * Math.random()));
            payment.showDetails();
        }
    }
}
