package ejercicios.modulo7.redsocial;

public class UsuarioNormal extends Usuario{

    public UsuarioNormal(String nombre){
        super(nombre);
    }

    @Override
    public void mostrarDetalles(){
        System.out.println("Usuario normal: " + nombre);
    }
}
