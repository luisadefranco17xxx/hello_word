package at.campus02.Tiere;

public class Bird extends Animal implements Fly{
    public Bird(String color){
        super(color, 2);
    }

    @Override
    public void makeNoise() {
        System.out.println("running around");
    }

    @Override
    public void walk() {
        System.out.println("cip cip");
    }

    @Override
    public void fly() {
        System.out.println("Fly through the sky");
    }
}
