package ejercicios.modulo4.domesticappliances;

public class Fridge  extends DomesticAppliances {
    private int capacity;

    public Fridge(String brand, double price, int capacity) {
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
        return capacity * 0.5;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Capacity: " + capacity);
    }
}
