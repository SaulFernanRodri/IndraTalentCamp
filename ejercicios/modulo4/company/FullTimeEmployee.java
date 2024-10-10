package ejercicios.modulo4.company;

public class FullTimeEmployee extends Employee{
    private double bonus;

    public FullTimeEmployee(String name, int age, String jobTitle, double salary, double bonus) {
        super(name, age, jobTitle, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: " + bonus);
    }
}
