package AnimalRescuer.Animals;

public class Animal {
    private String name ;
    private int age;
    private int healthlevel ;
    private int hungerlevel ;
    private int moodlevel ;
    private String favouritefood ;
    private String favouriteactivity;

    public String getName(){
        return name;

    }
    public void setName(String name){
        this.name = name;

    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getHealthlevel(){
        return healthlevel;
    }

    public void setHealthlevel(int healthlevel){
        this.healthlevel = healthlevel;
    }

    public int getHungerlevel() {
        return hungerlevel;
    }

    public void setHungerlevel(int hungerlevel) {
        this.hungerlevel = hungerlevel;
    }

    public int getMoodlevel(){
        return moodlevel;
    }

    public void setMoodlevel(int moodlevel) {
        this.moodlevel = moodlevel;
    }

    public String getFavouritefood() {
        return favouritefood;
    }

    public void setFavouritefood(String favouritefood) {
        this.favouritefood = favouritefood;
    }

    public String getFavouriterecreationalactivity(){
        return favouriteactivity;
    }

    public void setFavouriterecreationalactivity(String dogsfavouriterecreationalactivity) {
        this.favouriteactivity = favouriteactivity;
    }

    public void eat(){
        System.out.println("Eating food");
    }
    public void play(){
        System.out.println("playing with the ball");
    }
    public void drink(){
        System.out.println("drinking water");
    }
    public void sleep(){
        System.out.println("zzzzz");
    }
    public void growls(){
        System.out.println("howling when in pain");
    }

    public void speak() {
        System.out.println("Ham ham!");
    }
}
