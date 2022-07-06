package AnimalRescuer;

public class Cat {

    private String name;
    private int age;
    private int weight;
    private int healthlevel;
    private int moodlevel;
    private int hungerlevel;
    private String favouritefood;
    private String favouriteactivity;

    public String getName(){
        return name;
    }
    public void setName(String catname){
        this.name = catname;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int catweight){
        this.weight = catweight;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int catage){

        this.age = catage;
    }

    public int getHealthlevel(){
        return healthlevel;
    }

    public void setHealthlevel(int cathealthlevel){

        this.healthlevel = cathealthlevel;
    }

    public int getHungerlevel() {

        return hungerlevel;
    }

    public void setHungerlevel(int cathungerlevel) {

        this.hungerlevel = cathungerlevel;
    }
    public int getmoodlevel(){

        return moodlevel;
    }

    public void setMoodlevel(int catmoodlevel) {

        this.moodlevel = catmoodlevel;
    }

    public String getFavouritefood() {

        return favouritefood;
    }

    public void setFavouritefood(String catfavouritefood) {

        this.favouritefood = catfavouritefood;
    }

    public String getFavouriteactivity(){
        return favouriteactivity;
    }

    public void setFavouriteactivity(String catfavouriteactivity) {
        this.favouriteactivity = catfavouriteactivity;
    }

    public void eat(){
        System.out.println("Eating cat food");
    }
    public void play(){
        System.out.println("playing with toys");
    }
    public void drink(){
        System.out.println("drinking water");
    }
    public void sleep(){
        System.out.println("zzzzz");
    }
    public void meows(){
        System.out.println("Meow!");
    }

}
