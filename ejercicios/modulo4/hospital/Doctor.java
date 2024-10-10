package ejercicios.modulo4.hospital;

public class Doctor extends Person {

    private String speciality;


    public Doctor(String name, String speciality, String telephone) {
        super(name, telephone);
        this.speciality = speciality;

    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void showData() {
        System.out.println("Name: " + getName());
        System.out.println("Telephone: " + getTelephone());
        System.out.println("Speciality: " + speciality);
    }
}
