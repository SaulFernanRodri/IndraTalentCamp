package ejercicios.modulo4.hospital;

public class Patient extends Person {

    private String disease;


    public Patient(String name, String disease, String telephone) {
        super(name, telephone);
        this.disease = disease;

    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public void showData() {
        System.out.println("Name: " + getName());
        System.out.println("Telephone: " + getTelephone());
        System.out.println("Disease: " + disease);
    }
}
