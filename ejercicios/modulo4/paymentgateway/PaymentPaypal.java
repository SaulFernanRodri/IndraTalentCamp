package ejercicios.modulo4.paymentgateway;

public class PaymentPaypal implements IPayment{
    private String paymentId;
    private String email;

    public PaymentPaypal(String paymentId, String email) {
        this.paymentId = paymentId;
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " has been made with Paypal.");
    }

    @Override
    public void showDetails() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Email: " + email);
    }
}
