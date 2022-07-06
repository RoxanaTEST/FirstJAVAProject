package AnimalRescuer;

public class Monkey {
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
    public void setName(String monkeyname){
        this.name = monkeyname;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int monkeyweight){
        this.weight = monkeyweight;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int monkeyage){

        this.age = monkeyage;
    }

    public int getHealthlevel(){
        return healthlevel;
    }

    public void setHealthlevel(int monkeyhealthlevel){

        this.healthlevel = monkeyhealthlevel;
    }

    public int getHungerlevel() {

        return hungerlevel;
    }

    public void setHungerlevel(int monkeyhungerlevel) {

        this.hungerlevel = monkeyhungerlevel;
    }
    public int getmoodlevel(){

        return moodlevel;
    }

    public void setMoodlevel(int monkeymoodlevel) {

        this.moodlevel = monkeymoodlevel;
    }

    public String getFavouritefood() {

        return favouritefood;
    }

    public void setFavouritefood(String monkeyfavouritefood) {

        this.favouritefood = monkeyfavouritefood;
    }

    public String getFavouriteactivity(){
        return favouriteactivity;
    }

    public void setFavouriteactivity(String monkeyfavouriteactivity) {
        this.favouriteactivity = monkeyfavouriteactivity;
    }
    public void eat(){
        System.out.println("Eating monkey food");
    }
    public void play(){
        System.out.println("playing with oranges");
    }
    public void drink(){
        System.out.println("drinking water");
    }
    public void sleep(){
        System.out.println("zzzzz");
    }
    public void talks(){System.out.println("uuu aaa!");
    }
}
