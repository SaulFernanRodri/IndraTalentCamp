package tareas.Tarea2;

import javax.swing.JOptionPane;
import java.time.LocalDate;

public class MainUser {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("Juan", 45, "L001");
        Client client = new Client("Ana", 30, "C001");
        boolean exit = false;

        while (!exit) {
            String menu = """
                         LIBRARIAN
                        0. Add Material
                        1. Delete Material
                        2. List All Materials
                        3. List Materials by Type
                        4. Search Material
                        CLIENT
                        5. Borrow Material
                        6. Return Material
                        7. Show Borrowed Materials
                        5. Salir
                        Choose an option:
                    """;

            int choice = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (choice) {
                case 0:
                    addMaterial(librarian);
                    break;
                case 1:
                    removeMaterial(librarian);
                    break;
                case 2:
                    librarian.listAllMaterials();
                    break;
                case 3:
                    showMaterialsByType(librarian);
                    break;
                case 4:
                    searchMaterial(librarian);
                    break;
                case 5:
                    borrowMaterial(client, librarian);
                    break;
                case 6:
                    returnMaterial(client, librarian);
                    break;
                case 7:
                    client.showDetails();
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid option");
            }
        }
    }

    private static void addMaterial(Librarian librarian) {
        String[] materialTypes = {"Book", "Movie", "Magazine"};
        int materialType = JOptionPane.showOptionDialog(null, "Select material type", "Add Material",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, materialTypes, materialTypes[0]);

        String title = JOptionPane.showInputDialog("Enter the title:");
        String author = JOptionPane.showInputDialog("Enter the author:");
        LocalDate releaseDate = LocalDate.parse(JOptionPane.showInputDialog("Enter the release date (YYYY-MM-DD):"));
        String genre = JOptionPane.showInputDialog("Enter the genre:");
        int pagesOrDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of pages (for books) or duration in minutes (for movies):"));

        switch (materialType) {
            case 0:
                Book book = new Book(title, author, releaseDate, genre, pagesOrDuration);
                librarian.addMaterial(book);
                break;
            case 1:
                Movie movie = new Movie(title, author, releaseDate, genre, pagesOrDuration);
                librarian.addMaterial(movie);
                break;
            case 2:
                Magazine magazine = new Magazine(title, genre, releaseDate, author, pagesOrDuration);
                librarian.addMaterial(magazine);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid material type");
        }
    }

    private static void removeMaterial(Librarian librarian) {
        String title = JOptionPane.showInputDialog("Enter the title of the material to remove:");
        Material material = librarian.searchMaterial(title);
        if (material != null) {
            librarian.removeMaterial(material);
        } else {
            JOptionPane.showMessageDialog(null, "Material not found");
        }
    }

    private static void showMaterialsByType(Librarian librarian) {
        String[] materialTypes = {"Book", "Movie", "Magazine"};
        int materialType = JOptionPane.showOptionDialog(null, "Select material type", "Show Materials by Type",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, materialTypes, materialTypes[0]);

        switch (materialType) {
            case 0:
                librarian.listMaterialsByType("Book");
                break;
            case 1:
                librarian.listMaterialsByType("Movie");
                break;
            case 2:
                librarian.listMaterialsByType("Magazine");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid material type");
        }
    }

    private static void searchMaterial(Librarian librarian) {
        String title = JOptionPane.showInputDialog("Enter the title of the material to search:");
        Material material = librarian.searchMaterial(title);
        if (material != null) {
            material.showDetails();
        } else {
            JOptionPane.showMessageDialog(null, "Material not found");
        }
    }

    private static void borrowMaterial(Client client, Librarian librarian) {
        String title = JOptionPane.showInputDialog("Enter the title of the material to borrow:");
        Material material = librarian.searchMaterial(title);
        if (material != null) {
            client.borrowMaterial(material);
        } else {
            JOptionPane.showMessageDialog(null, "Material not found");
        }
    }

    private static void returnMaterial(Client client, Librarian librarian) {
        String title = JOptionPane.showInputDialog("Enter the title of the material to return:");
        Material material = librarian.searchMaterial(title);
        if (material != null) {
            client.returnMaterial(material);
        } else {
            JOptionPane.showMessageDialog(null, "Material not found");
        }
    }
}