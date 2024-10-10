package ejercicios.modulo4.hospital;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. House", "Diagnosis", "123456789");
        Patient patient = new Patient("John Doe", "Covid-19", "123456789");
        Date date = new Date(doctor, patient, "01/01/2021");
        date.showData();
    }
}
