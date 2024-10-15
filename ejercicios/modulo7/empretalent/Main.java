package ejercicios.modulo7.empretalent;

public class Main {

    public static void main(String[] args) {

        Shop shop = new Shop();

        Book book1 = new Book("Book 1", 10, 5, "Author 1");
        Clothes clothes1 = new Clothes("Clothes 1", 20, 10,"Size 1");
        Electronic electronics1 = new Electronic("Electronic 1", 30, 15, 1);

        shop.addProduct(book1);
        shop.addProduct(clothes1);
        shop.addProduct(electronics1);

        shop.removeProduct(book1);

        shop.getProduct("Electronic 1").discount(5.0);
        shop.getProduct("Clothes 1").discount(10.0);

        shop.getProducts();

    }
}
