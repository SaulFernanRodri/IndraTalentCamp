package ejercicios.modulo7.gestionproyectos;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Operacion {
    String nombre();
}