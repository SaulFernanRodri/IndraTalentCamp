package ejercicios.modulo6.libreria;

public class Bibliotecario extends Persona {
    private double salario;

    public Bibliotecario(String nombre, int edad, double salario) {
        super(nombre, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Bibliotecario: " + getNombre() + ", Edad: " + getEdad() + ", Salario: " + getSalario());
    }

}
