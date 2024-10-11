package tareas.Tarea2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell", LocalDate.of(1949, 6, 8), "Dystopian", 328);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", LocalDate.of(1960, 7, 11), "Fiction", 281);
        Movie movie1 = new Movie("Inception", "Christopher Nolan", LocalDate.of(2010, 7, 16), "Sci-Fi", 148);
        Magazine magazine1 = new Magazine("National Geographic", "Science", LocalDate.of(1888, 9, 22), "Adventure", 100);

        Library library = new Library();
        Librarian librarian = new Librarian("Juan", 45, "L001");

        librarian.addMaterial(library, book1);
        librarian.addMaterial(library, book2);
        librarian.addMaterial(library, movie1);
        librarian.addMaterial(library, magazine1);

        System.out.println("-------------------------------------");

        librarian.listAllMaterials(library);
        library.showMaterialsByType("Book");
        library.showMaterialsByType("Movie");
        library.showMaterialsByType("Magazine");
        librarian.searchMaterial(library, "1984");

        System.out.println("-------------------------------------");

        Client client = new Client("John Doe", 30, "C123");
        client.borrowMaterial(book1);
        client.borrowMaterial(movie1);

        System.out.println("-------------------------------------");

        client.showDetails();

        System.out.println("-------------------------------------");

        client.returnMaterial(book1);
        client.showDetails();

        System.out.println("-------------------------------------");

        librarian.removeMaterial(library, book1);
        librarian.listAllMaterials(library);
    }
}