package ejercicios.modulo7.gestionproyectos;

public class Empleado {
    private String nombre;
    private int edad;
    private RollEmpleado roll;

    public Empleado(String nombre, int edad, RollEmpleado roll){
        this.nombre = nombre;
        this.edad = edad;
        this.roll = roll;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RollEmpleado getRoll() {
        return roll;
    }

    public void setRoll(RollEmpleado roll) {
        this.roll = roll;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", roll=" + roll +
                '}';
    }
}
