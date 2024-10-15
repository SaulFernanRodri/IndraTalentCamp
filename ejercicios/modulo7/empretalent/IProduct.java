package ejercicios.modulo7.empretalent;

public interface IProduct {
    void checkOut();
    void checkIn();
    boolean isAvailable();
    void discount( double percentage);
}
