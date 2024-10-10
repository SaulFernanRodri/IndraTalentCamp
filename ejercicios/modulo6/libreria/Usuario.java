package ejercicios.modulo6.libreria;

public class Usuario extends Persona {
    private String id;
    private String tipo;

    public Usuario(String nombre, int edad, String id, String tipo) {
        super(nombre, edad);
        this.id = id;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Usuario: " + getNombre() + ", Edad: " + getEdad() + ", Id: " + getId());
    }
}
