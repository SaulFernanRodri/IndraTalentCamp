package ejercicios.modulo4.animal;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Dog dog = new Dog("Bobby", 3, "Labrador");
        Cat cat = new Cat("Kitty", 2, "Persian");
        Bird bird = new Bird("Tweety", 1, "Yellow");

        animals.add(dog);
        animals.add(cat);
        animals.add(bird);

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            System.out.println();
        }
    }
}
