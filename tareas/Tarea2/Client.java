package tareas.Tarea2;

import java.util.ArrayList;

public class Client extends Person {
    private final String clientId;
    private final ArrayList<Material> borrowedMaterials;

    public Client(String name, int age, String clientId) {
        super(name, age);
        this.clientId = clientId;
        this.borrowedMaterials = new ArrayList<>();
    }

public void borrowMaterial(Material material) {
    boolean isBorrowed = material.isAvailable();
    if (isBorrowed) {
        System.out.println("The material is not available.");
    } else {
        borrowedMaterials.add(material);
        material.checkOut();
    }
}

public void returnMaterial(Material material) {
    boolean isBorrowed = material.isAvailable();
    if (!isBorrowed) {
        System.out.println("The material is not borrowed.");
    } else {
        borrowedMaterials.remove(material);
        material.checkIn();
    }
}

private void showBorrowedMaterials() {
    System.out.println("Borrowed Materials:");
    for (Material material : borrowedMaterials) {
        material.showDetails();
    }
}

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Client ID: " + clientId);
        showBorrowedMaterials();
    }
}