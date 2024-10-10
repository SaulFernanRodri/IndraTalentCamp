package ejercicios.modulo4.electronicdevices;

public class MovilPhone implements IDevice{
    private String brand;
    private String model;
    private String imei;

    public MovilPhone(String brand, String model, String imei) {
        this.brand = brand;
        this.model = model;
        this.imei = imei;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is turning on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Phone is turning off...");
    }

    public void call(String number) {
        System.out.println("Calling to " + number);
    }

    public void sendSMS(String number, String message) {
        System.out.println("Sending SMS to " + number + ": " + message);
    }

    public void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("IMEI: " + imei);
    }
}
