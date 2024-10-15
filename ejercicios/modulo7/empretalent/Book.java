package ejercicios.modulo7.empretalent;


public class Book extends Product {

    private String author;

    public Book(String name, double price, int cant, String author) {
        super(name, price, cant, CategoryProduct.BOOK);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + "Book{" +
                "author='" + author + '\'' +
                '}';
    }
}
