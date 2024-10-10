package ejercicios.modulo4.electronicdevices;

public class Main{
    public static void main(String[] args) {
        MovilPhone movilPhone = new MovilPhone("Samsung", "Galaxy S10", "123456789");
        Laptop laptop = new Laptop("Apple", "MacBook Pro", "987654321");

        movilPhone.turnOn();
        movilPhone.call("123456789");
        movilPhone.sendSMS("123456789", "Hello, how are you?");
        movilPhone.showDetails();
        movilPhone.turnOff();

        System.out.println();

        laptop.turnOn();
        laptop.showDetails();
        laptop.turnOff();
    }
}
