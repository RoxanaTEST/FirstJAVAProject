
package AnimalRescuer;

import AnimalRescuer.Activities.RecreationalActivity;
import AnimalRescuer.Animals.Cat;
import AnimalRescuer.Animals.Dog;
import AnimalRescuer.Animals.Monkey;
import AnimalRescuer.Animals.Rabbit;
import AnimalRescuer.Food.DogFood;
import AnimalRescuer.People.Adopter;
import AnimalRescuer.People.VeterinaryDoctor;

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
        Tommy.speak();


        DogFood Pedigree = new DogFood();
        System.out.println(Pedigree.getStockavailabilitypcs());
        Pedigree.setStockavailabilitypcs(1000);


        System.out.println(Pedigree.getPriceron());
        Pedigree.setPriceron(30);

        RecreationalActivity games = new RecreationalActivity();
        System.out.println(games.getName());
        games.setName("play with the ball");


        Cat Cora = new Cat();
        System.out.println(Cora.getName());
        Cora.setName("Cora");
        Cora.setAge(1);
        Cora.setFavouritefood("Whiskas");
        Cora.setHealthlevel(5);
        Cora.setMoodlevel(5);
        Cora.setHungerlevel(1);

        Cora.drink();
        Cora.speak();

        Monkey Sissy = new Monkey();
        System.out.println(Sissy.getName());
        Sissy.setName("Sissy");
        Sissy.setAge(4);
        Sissy.setFavouritefood("Bananas");
        Sissy.setHealthlevel(5);
        Sissy.setMoodlevel(5);
        Sissy.setHungerlevel(5);

        Sissy.sleep();
        Sissy.play();
        Sissy.jumpintrees();


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

        Rabbit Luke = new Rabbit();
        System.out.println(Luke.getName());
        Luke.setAge(3);
        Luke.play();

        VeterinaryDoctor Mike = new VeterinaryDoctor();
        System.out.println(Mike.getName());
        Mike.treatoffer();

        VeterinaryDoctor role = new VeterinaryDoctor();
        System.out.println(role.getSpecialization());
        role.setSpecialization("Cardiologist");



        Adopter Roxana = new Adopter();
        System.out.println(Roxana.getName());
        Roxana.setName("Roxana");
        Roxana.buydogfood();


        System.out.println(Roxana.getAvailablemoneyron());
        Roxana.setAvailablemoneyron(7000);


        Monkey Amanda = new Monkey();
        Amanda.speak();

        Cat Dennise = new Cat();
        Dennise.speak();



    }
}
