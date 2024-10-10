package ejercicios.modulo4.ecommerce;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("John Doe", "123 Main St", "555-1234");
        Cart cart = new Cart();
        Product product1 = new Product("Laptop", 1000, 1);
        Product product2 = new Product("Mouse", 20, 2);
        Product product3 = new Product("Keyboard", 50, 1);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        Order order = new Order(cart, client, "Credit Card");
        order.printOrder();
    }
}
