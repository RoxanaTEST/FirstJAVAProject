
package AnimalRescuer;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Dog Tommy = new Dog();
        System.out.println(Tommy.name);
        Tommy.bark();

        Adopter Roxana = new Adopter();
        System.out.println(Roxana.name);
        System.out.println(Roxana.availablemoneyron);

        DogFood Pedigree = new DogFood();
        System.out.println(Pedigree.stockavailabilitypcs);
        System.out.println(Pedigree.priceron);

        RecreationalActivity games = new RecreationalActivity();
        System.out.println(games.name);

        VeterinaryDoctor role = new VeterinaryDoctor();
        System.out.println(role.specialization);
    }
}
