package ejercicios.modulo7.empretalent;

public abstract class Product implements IProduct {
    private String name;
    private double price;
    private int cant;
    private CategoryProduct category;

    public Product(String name, double price, int cant, CategoryProduct category) {
        this.name = name;
        this.price = price;
        this.cant = cant;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryProduct getCategory() {
        return category;
    }

    public void setCategory(CategoryProduct category) {
        this.category = category;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void checkOut(){
        if (cant == 0) {
            throw new ProductInvalidException("The product is not available.");
        }
        cant--;
    }

    @Override
    public void checkIn() {
        cant++;
    }

    @Override
    public boolean isAvailable() {
        return cant > 0;
    }

    @Override
    public void discount(double percentage) {
        price = price * (percentage / 100);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", cant=" + cant +
                ", category=" + category +
                '}';
    }
}
