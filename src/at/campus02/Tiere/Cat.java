package at.campus02.Tiere;

public class Cat extends Animal {
    protected String name;

    public Cat(String color, int countEyes, String name) {
        super(color, countEyes);
        this.name=name;

    }
    public void makeNoise(){

        System.out.println("I´m the cat: miao");
    }
    public  void walk(){

        System.out.println("The cat "+name+ " walks");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", countEyes=" + countEyes +
                ", name='" + name + '\'' +
                '}';
    }
}
