package ejercicios.modulo4.paymentgateway;

public class PaymentCardDebit implements IPayment {
    private String paymentId;
    private String cardNumber;
    private String cardHolder;

    public PaymentCardDebit(String paymentId, String cardNumber, String cardHolder) {
        this.paymentId = paymentId;
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " has been made with Debit Card.");
    }

    @Override
    public void showDetails() {
        System.out.println("Payment ID: " + paymentId);
        System.out.println("Card Number: " + "**** **** **** " + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Card Holder: " + cardHolder);
    }
}
