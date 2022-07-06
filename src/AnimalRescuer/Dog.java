package AnimalRescuer;

public class Dog {
    private String name ;
    private int age;
    private int healthlevel ;
    private int hungerlevel ;
    private int moodlevel ;
    private String favouritefood ;
    private String favouriterecreationalactivity;


    public String getName(){
        return name;

    }
    public void setName(String dogname){
        this.name = dogname;

    }

    public int getAge(){
        return age;
    }

    public void setAge(int dogage){
        this.age = dogage;
    }

    public int getHealthlevel(){
        return healthlevel;
    }

    public void setHealthlevel(int doghealthlevel){
        this.healthlevel = doghealthlevel;
    }

    public int getHungerlevel() {
        return hungerlevel;
    }

    public void setHungerlevel(int doghungerlevel) {
        this.hungerlevel = doghungerlevel;
    }

    public int getMoodlevel(){
        return moodlevel;
    }

    public void setMoodlevel(int dogmoodlevel) {
        this.moodlevel = dogmoodlevel;
    }

    public String getFavouritefood() {
        return favouritefood;
    }

    public void setFavouritefood(String dogsfavouritefood) {
        this.favouritefood = dogsfavouritefood;
    }

    public String getFavouriterecreationalactivity(){
        return favouriterecreationalactivity;
    }

    public void setFavouriterecreationalactivity(String dogsfavouriterecreationalactivity) {
        this.favouriterecreationalactivity = dogsfavouriterecreationalactivity;
    }

    public void eat(){
        System.out.println("Eating dog food");
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
    public void bark(){
        System.out.println("Ham ham!");
    }

    public void growls(){
        System.out.println("howling when in pain");
    }
}
