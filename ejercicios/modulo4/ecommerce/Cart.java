package ejercicios.modulo4.ecommerce;

import java.util.ArrayList;

public class Cart {
    private final ArrayList<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    public void printCart() {
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + " - Price: " + product.getPrice() + " - Quantity: " + product.getQuantity());
        }
        System.out.println("Total: " + calculateTotal());
    }
}
