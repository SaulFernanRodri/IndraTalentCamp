package ejercicios.modulo4.animal;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Guau");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Raza: " + breed);
    }
}
