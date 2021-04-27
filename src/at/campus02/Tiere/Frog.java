package at.campus02.Tiere;

public class Frog extends Animal{

    public Frog(String color, int countEyes) {
        super(color, countEyes);
    }
    public void makeNoise(){
        System.out.println("I´m the Frog: quak");
    }
    public  void walk(){
        System.out.println("The Frog jumps" );
    }

    @Override
    public String toString() {
        return "Frog{" +
                "color='" + color + '\'' +
                ", countEyes=" + countEyes +
                '}';
    }
}
