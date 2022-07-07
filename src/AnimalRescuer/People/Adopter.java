package AnimalRescuer.People;

public class Adopter extends People {

    private double availablemoneyron ;


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

    public void feedthedog(){
        System.out.println("Feeds the dog");
    }
    public void cleanthedog(){
        System.out.println("bathe the dog");
    }

}
