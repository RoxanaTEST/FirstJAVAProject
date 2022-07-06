
package AnimalRescuer;

import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Dog Tommy = new Dog();
        System.out.println(Tommy.getName());
        Tommy.setName("tommy");
        Tommy.setAge(7);
        Tommy.setFavouritefood("Pedigree");
        Tommy.setHealthlevel(4);
        Tommy.setMoodlevel(5);
        Tommy.setHungerlevel(1);

        Tommy.drink();
        Tommy.bark();

        Adopter Roxana = new Adopter();
        System.out.println(Roxana.getName());
        Roxana.setName("Roxana");


        System.out.println(Roxana.getAvailablemoneyron());
        Roxana.setAvailablemoneyron(7000);

        DogFood Pedigree = new DogFood();
        System.out.println(Pedigree.getStockavailabilitypcs());
        Pedigree.setStockavailabilitypcs(1000);

        System.out.println(Pedigree.getPriceron());
        Pedigree.setPriceron(30);

        RecreationalActivity games = new RecreationalActivity();
        System.out.println(games.getName());
        games.setName("play with the ball");

        VeterinaryDoctor role = new VeterinaryDoctor();
        System.out.println(role.getSpecialization());
        role.setSpecialization("Cardiologist");

        Cat Cora = new Cat();
        System.out.println(Cora.getName());
        Cora.setName("Cora");
        Cora.setAge(1);
        Cora.setFavouritefood("Whiskas");
        Cora.setHealthlevel(5);
        Cora.setMoodlevel(5);
        Cora.setHungerlevel(1);

        Cora.drink();
        Cora.meows();

        Monkey Sissy = new Monkey();
        System.out.println(Sissy.getName());
        Sissy.setName("Sissy");
        Sissy.setAge(4);
        Sissy.setFavouritefood("Bananas");
        Sissy.setHealthlevel(5);
        Sissy.setMoodlevel(5);
        Sissy.setHungerlevel(5);

        Sissy.sleep();
        Sissy.talks();
        Sissy.play();


        Rabbit Cocky = new Rabbit();
        System.out.println(Cocky.getName());
        Cocky.setName("Cocky");
        Cocky.setAge(1);
        Cocky.setFavouritefood("Carrots");
        Cocky.setHealthlevel(5);
        Cocky.setMoodlevel(4);
        Cocky.setHungerlevel(3);

        Cocky.sleep();
        Cocky.drink();
        Cocky.eat();
    }
}
