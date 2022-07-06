package AnimalRescuer;

public class Rabbit {
    private String name ;
    private int age;
    private int weight;
    private int healthlevel ;
    private int hungerlevel ;
    private int moodlevel ;
    private String favouritefood ;
    private String favouriteactivity;

    public String getName(){
        return name;
    }
    public void setName(String rabbitname){
        this.name = rabbitname;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int rabbitweight){
        this.weight = rabbitweight;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int rabbitage){

        this.age = rabbitage;
    }

    public int getHealthlevel(){
        return healthlevel;
    }

    public void setHealthlevel(int rabbithealthlevel){

        this.healthlevel = rabbithealthlevel;
    }

    public int getHungerlevel() {

        return hungerlevel;
    }

    public void setHungerlevel(int rabbithungerlevel) {

        this.hungerlevel = rabbithungerlevel;
    }
    public int getmoodlevel(){

        return moodlevel;
    }

    public void setMoodlevel(int rabbitmoodlevel) {

        this.moodlevel = rabbitmoodlevel;
    }

    public String getFavouritefood() {

        return favouritefood;
    }

    public void setFavouritefood(String rabbitfavouritefood) {

        this.favouritefood = rabbitfavouritefood;
    }

    public String getFavouriteactivity(){
        return favouriteactivity;
    }

    public void setFavouriteactivity(String rabbitfavouriteactivity) {
        this.favouriteactivity = rabbitfavouriteactivity;
    }
    public void eat(){
        System.out.println("Eating rabbit food");
    }
    public void drink(){
        System.out.println("drinking water");
    }
    public void sleep(){
        System.out.println("zzzzz");
    }
}
