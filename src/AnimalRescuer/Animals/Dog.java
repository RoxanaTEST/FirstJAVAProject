package AnimalRescuer.Animals;

public class Dog extends Animal {


    private int fangslenght;

    public int getFangslenght() {
        return fangslenght;
    }

    public void setFangslenght(int fangslenght) {
        this.fangslenght = fangslenght;
    }


    public void speak (){
        System.out.println("Ham ham!");
    }


}
