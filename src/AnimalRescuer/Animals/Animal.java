package AnimalRescuer.Animals;

public abstract class Animal {
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

    public abstract void eat();
    public abstract void play();
    public abstract void drink();
    public abstract void sleep();

    public abstract void speak();
    }

