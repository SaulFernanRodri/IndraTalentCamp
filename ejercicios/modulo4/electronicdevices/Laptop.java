package ejercicios.modulo4.electronicdevices;

public class Laptop implements IDevice {
    private String brand;
    private String model;
    private String serialNumber;

    public Laptop(String brand, String model, String serialNumber) {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop is turning on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is turning off...");
    }

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Serial Number: " + serialNumber);
    }
}
