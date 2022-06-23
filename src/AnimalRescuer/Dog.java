package AnimalRescuer;

public class Dog {
    String name = "Tommy";
    int age = 7;
    int healthlevel ;
    int hungerlevel ;
    int moodlevel ;
    String favouritefood = "Pedigree";
    String favouriterecreationalactivity = "ball play";

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
