package tareas.Tarea2;

public class Librarian extends Person {
    private final String employeeId;
    private final Library library;

    public Librarian(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
        this.library = new Library();
    }

    public void addMaterial(Material material) {
        library.addMaterial(material);
        System.out.println("Material added to the library.");
    }

    public void removeMaterial(Material material) {
        library.removeMaterial(material);
        System.out.println("Material removed from the library.");
    }

    public Material searchMaterial(String title) {
        for (Material material : library.getMaterials()) {
            if (material.getTitle().equalsIgnoreCase(title)) {
                material.showDetails();
                return material;
            }
        }
        System.out.println("Material not found.");
        return null;
    }



    public void listAllMaterials() {
        library.showAllMaterials();
    }

    public void listMaterialsByType(String type) {
        library.showMaterialsByType(type);
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Employee ID: " + employeeId);
    }
}