package ejercicios.modulo6.concesionario;

public class Cliente extends Persona{
    private String telefono;

    public Cliente(String nombre, String direccion, String telefono){
        super(nombre, direccion);
        this.telefono = telefono;
    }

    public String getTelefono(){
        return telefono;
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Cliente: " + nombre + ", Dirección: " + direccion + ", Teléfono: " + telefono);
    }
}
