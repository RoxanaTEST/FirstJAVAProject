package AnimalRescuer.Animals;

public class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println("Ham Ham!");

    }

    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void sleep() {

    }

    private int fangslenght;

    public int getFangslenght() {
        return fangslenght;
    }

    public void setFangslenght(int fangslenght) {
        this.fangslenght = fangslenght;
    }



    public void growls(){
        System.out.println("howling when in pain");
    }


}
