package ejercicios.modulo6.biblioteca;


public class Bibliotecario extends Persona{
    public Bibliotecario(String nombre, String id){
        super(nombre, id);
    }
    @Override
    public void mostrarDetalles(){
        System.out.println("Bibliotecario: " + nombre + ", ID: " + id);
    }    
}
