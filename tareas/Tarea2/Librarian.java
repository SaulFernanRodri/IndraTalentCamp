package tareas.Tarea2;

public class Librarian extends Person {
    private final String employeeId;

    public Librarian(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public void addMaterial(Library library, Material material) {
        library.addMaterial(material);
        System.out.println("Material added to the library.");
    }

    public void removeMaterial(Library library, Material material) {
        library.removeMaterial(material);
        System.out.println("Material removed from the library.");
    }

    public void searchMaterial(Library library, String title) {
        int cont=0;
        for (Material material : library.getMaterials()) {
            if (material.getTitle().equalsIgnoreCase(title)) {

                material.showDetails();
                cont++;
            }
        }
        if (cont>0) {
            System.out.println("Material not found.");
        }
    }

    public void listAllMaterials(Library library) {
        library.showAllMaterials();
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Employee ID: " + employeeId);
    }
}