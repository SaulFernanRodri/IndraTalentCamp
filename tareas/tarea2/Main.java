package tareas.tarea2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell", LocalDate.of(1949, 6, 8), "Dystopian", 328);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", LocalDate.of(1960, 7, 11), "Fiction", 281);
        Movie movie1 = new Movie("Inception", "Christopher Nolan", LocalDate.of(2010, 7, 16), "Sci-Fi", 148);
        Magazine magazine1 = new Magazine("National Geographic", "Science", LocalDate.of(1888, 9, 22), "Adventure", 100);

        Librarian librarian = new Librarian("Juan", 45, "L001");

        librarian.addMaterial(book1);
        librarian.addMaterial(book2);
        librarian.addMaterial(movie1);
        librarian.addMaterial(magazine1);

        System.out.println("-------------------------------------");

        librarian.listAllMaterials();
        librarian.listMaterialsByType("Book");
        librarian.listMaterialsByType("Movie");
        librarian.listMaterialsByType("Magazine");
        librarian.searchMaterial("1984");

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

        librarian.removeMaterial(book1);
        librarian.listAllMaterials();
    }
}