package ejercicios.modulo4.company;

public class PartTimeEmployee extends Employee {
    private int WorkHours;
    private Double HourlyRate;

    public PartTimeEmployee(String name, int age, String jobTitle, int WorkHours, Double HourlyRate) {
        super(name, age, jobTitle, WorkHours * HourlyRate);
        this.WorkHours = WorkHours;
        this.HourlyRate = HourlyRate;
    }

    public int getWorkHours() {
        return WorkHours;
    }

    public void setWorkHours(int WorkHours) {
        this.WorkHours = WorkHours;
        setSalary(WorkHours * HourlyRate);
    }

    public Double getHourlyRate() {
        return HourlyRate;
    }

    public void setHourlyRate(Double HourlyRate) {
        this.HourlyRate = HourlyRate;
        setSalary(WorkHours * HourlyRate);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Work Hours: " + WorkHours);
        System.out.println("Hourly Rate: " + HourlyRate);
    }
}
