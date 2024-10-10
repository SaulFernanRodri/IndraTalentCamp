package ejercicios.modulo4.company;

public class Client extends Person {
    private String companyName;

    public Client(String name, int age, String companyName) {
        super(name, age);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Company Name: " + companyName);
    }
}
