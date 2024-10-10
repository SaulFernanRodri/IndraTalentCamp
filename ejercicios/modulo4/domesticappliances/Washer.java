package ejercicios.modulo4.domesticappliances;

public class Washer extends DomesticAppliances {
    private int capacity;

    public Washer(String brand, double price, int capacity) {
        super(brand, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public double calculatePowerConsumption() {
        return capacity * 0.8;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Capacity: " + capacity);
    }

}
