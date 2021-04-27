package at.campus02.Tiere;

public class Lion extends Animal {
    public Lion(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void makeNoise() {
        System.out.println("I´m the lion: greea!!");
    }

    public  void walk(){
        System.out.println("The lion runs.");
    }

    @Override
    public String toString() {
        return "Lion{" +
                "color='" + color + '\'' +
                ", countEyes=" + countEyes +
                '}';
    }
}
