package ejercicios.modulo7.empretalent;

import java.util.ArrayList;

public class Shop {
    private final ArrayList<Product> products;

    public Shop() {
        products = new ArrayList<>();
    }

    @Operation(name="addProduct")
    public void addProduct(Product product) {
        product.checkOut();
        products.add(product);
    }

    @Operation(name="removeProduct")
    public void removeProduct(Product product) {
        product.checkIn();
        products.remove(product);
    }

    @Operation(name="getProducts")
    public void getProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Operation(name="getProduct")
    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product);
                return product;
            }
        }
        return null;
    }
}
