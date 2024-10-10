package ejercicios.modulo4.domesticappliances;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<DomesticAppliances> domesticAppliances = new ArrayList<>();

        Washer washer = new Washer("Samsung", 500, 10);
        Microwave microwave = new Microwave("Balay", 300, 1000);
        Fridge fridge = new Fridge("LG", 800, 500);

        domesticAppliances.add(washer);
        domesticAppliances.add(microwave);
        domesticAppliances.add(fridge);

        for (DomesticAppliances domesticAppliance : domesticAppliances) {
            domesticAppliance.displayInfo();
            System.out.println("Power Consumption: " + domesticAppliance.calculatePowerConsumption());
            System.out.println();
        }


    }
}
