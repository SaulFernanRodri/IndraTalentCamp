package ejercicios.modulo4.domesticappliances;

public class Microwave extends DomesticAppliances {
    private int power;


    public Microwave(String brand, double price, int power) {
        super(brand, price);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public double calculatePowerConsumption() {
        return power * 0.1;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Power: " + power);

    }
}
