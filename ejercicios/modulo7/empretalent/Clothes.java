package ejercicios.modulo7.empretalent;

public class Clothes extends Product {
    private String size;

    public Clothes(String name, double price, int cant, String size) {
        super(name, price, cant, CategoryProduct.CLOTHES);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString()+ "Clothes{" +
                "size='" + size + '\'' +
                '}';
    }
}
