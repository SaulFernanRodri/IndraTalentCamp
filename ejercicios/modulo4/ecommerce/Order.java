package ejercicios.modulo4.ecommerce;

public class Order {
    private Cart cart;
    private Client client;
    private String paymentMethod;

    public Order(Cart cart, Client client, String paymentMethod) {
        this.cart = cart;
        this.client = client;
        this.paymentMethod = paymentMethod;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void printOrder() {
        System.out.println("Client: " + client.getName());
        System.out.println("Payment Method: " + paymentMethod);
        cart.printCart();
    }
}
