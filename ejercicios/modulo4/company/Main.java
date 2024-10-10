package ejercicios.modulo4.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        Boss boss = new Boss("Saul", 45, "SID");
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Ana", 30, "Junior Developer", 20, 25.0);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Pedro", 35, "Senior Developer", 3000.0, 500.0);

        people.add(boss);
        people.add(partTimeEmployee);
        people.add(fullTimeEmployee);

        Client client = new Client("Erik", 50, "Tech Company");
        Order order = new Order("ORD123", client);
        order.addOrderDetail("500 PCs");
        order.addOrderDetail("200 Monitors");
        order.addOrderDetail("50 Keyboards");

        for (Person person : people) {
            person.displayInfo();
            System.out.println();
        }

        order.displayOrderInfo();
    }
}
