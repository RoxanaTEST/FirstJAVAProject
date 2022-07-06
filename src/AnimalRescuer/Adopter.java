package AnimalRescuer;

public class Adopter {
    private String name ;
    private double availablemoneyron ;

    public String getName(){
        return name;
    }

    public void setName(String adoptername) {
        this.name = adoptername;
    }

    public double getAvailablemoneyron() {
        return availablemoneyron;
    }

    public void setAvailablemoneyron(double adopteravailablemoneyron) {
        this.availablemoneyron = adopteravailablemoneyron;
    }

    public void rescuesapet(){
        System.out.println("Goes to the dog shelter and adopts a dog");
    }
    public void dogveterinarycheckup(){
        System.out.println("Goes to the vet to check the dog's health condition");
    }
    public void buydogfood(){
        System.out.println("Goes to the shop to buy dogfood");
    }
    public void playwiththedog(){
        System.out.println("Plays with the dog");
    }
    public void feedthedog(){
        System.out.println("Feeds the dog");
    }
    public void cleanthedog(){
        System.out.println("bathe the dog");
    }
    public void givingtreats(){
        System.out.println("Offers treats whenever the dog is behaving well");
    }
}
