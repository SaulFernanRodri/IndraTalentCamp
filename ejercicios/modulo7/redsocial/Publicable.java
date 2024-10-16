package ejercicios.modulo7.redsocial;

public interface Publicable {
    void publicar(String contenido, TipoPublicacion tipo);
    int contarPalabras(String contenido);
}
