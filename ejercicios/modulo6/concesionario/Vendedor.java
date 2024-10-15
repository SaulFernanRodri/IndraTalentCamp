package ejercicios.modulo6.concesionario;

public class Vendedor extends Persona{

    private final double salario;

    public Vendedor(String nombre, String direccion, double salario){
        super(nombre, direccion);
        this.salario = salario;
    }

    //Getter del salario
    public double getSalario(){
        return salario;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Vendedor: " + nombre + ", Dirección: " + direccion + ", Salario: " + salario);
    }
}
