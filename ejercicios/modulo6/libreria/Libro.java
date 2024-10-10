package ejercicios.modulo6.libreria;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private String editorial;
    private boolean disponibilidad;

    public Libro(String titulo, String autor, int paginas, String editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void prestar() {
        disponibilidad = false;
    }

    public void devolver() {
        disponibilidad = true;
    }

    public void mostrarInformacion() {
        System.out.println("Libro: " + getTitulo() + ", Autor: " + getAutor() + ", Paginas: " + getPaginas() + ", Editorial: " + getEditorial() + ", Disponibilidad: " + (disponibilidad ? "Disponible" : "No disponible"));
    }
}
