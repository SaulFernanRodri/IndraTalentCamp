package ejercicios.modulo4.company;

public  abstract class Employee extends Person {
    private String jobTitle;
    private Double salary;

    public Employee(String name, int age, String jobTitle, Double salary) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}

