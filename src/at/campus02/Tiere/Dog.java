package at.campus02.Tiere;

public class Dog extends Animal{
    protected String name;

    public Dog(String color, int countEyes,String name) {
        super(color, countEyes);
        this.name=name;

    }
    public void makeNoise(){

        System.out.println("I´m the dog: bau");
    }
    public  void walk(){
        System.out.println("The dog walks");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", countEyes=" + countEyes +
                ", name='" + name + '\'' +
                '}';
    }
}
