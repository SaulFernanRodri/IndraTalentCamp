package ejercicios.modulo7.redsocial;

public interface IPublicable {
    void publicar(String contenido, TipoPublicacion tipo);
    int contarPalabras(String contenido);
}
