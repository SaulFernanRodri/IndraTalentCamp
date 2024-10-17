package tareas.tarea2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final ArrayList<Material> materials;

    public Library() {
        this.materials = new ArrayList<>();
    }

    public void addMaterial(Material material) {
        materials.add(material);
    }

    public void removeMaterial(Material material) {
        materials.remove(material);
    }


    public List<Material> getMaterials() {
        return materials;
    }

    public void showAllMaterials() {
        System.out.println("Library Materials:");
        for (Material material : materials) {
            material.showDetails();
        }
    }

    public void showMaterialsByType(String type) {
        for (Material material : materials) {
            switch (type.toLowerCase()) {
                case "book":
                    if (material instanceof Book) {
                        material.showDetails();
                    }
                    break;
                case "movie":
                    if (material instanceof Movie) {
                        material.showDetails();
                    }
                    break;
                case "magazine":
                    if (material instanceof Magazine) {
                        material.showDetails();
                    }
                    break;
                default:
                    System.out.println("Unknown material type: " + type);
            }
        }
    }
}