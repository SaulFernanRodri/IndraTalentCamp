package ejercicios.modulo6.aerotalent;

public abstract class Persona {
    protected String nombre;
    protected String id;

    public Persona(String nombre, String id){
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }
    public abstract void mostrarDetalles();
}
