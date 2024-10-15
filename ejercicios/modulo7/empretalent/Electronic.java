package ejercicios.modulo7.empretalent;

public class Electronic extends Product{
    private int warranty;

    public Electronic(String name, double price, int cant, int warranty) {
        super(name, price, cant, CategoryProduct.ELECTRONIC);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return super.toString() + "Electronic{" +
                "warranty=" + warranty +'\'' +
                '}';
    }
}
