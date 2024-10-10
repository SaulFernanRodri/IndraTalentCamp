package ejercicios.modulo4.hospital;

public class Date {
    private Doctor doctor;
    private Patient patient;
    private String date;

    public Date(Doctor doctor, Patient patient, String date) {
        this.doctor = doctor;
        this.patient = patient;
        this.date = date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void showData() {
        System.out.println("Doctor: ");
        doctor.showData();
        System.out.println("Patient: ");
        patient.showData();
        System.out.println("Date: " + date);
    }
}
