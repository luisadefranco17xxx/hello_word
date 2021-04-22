package at.campus02.Dog;

public class DogApp {
    public static void main(String[] args) {

        Dog mdog =new Dog();
        mdog.eyeColor="brown";
        mdog.weight=10;

        mdog.bark();        System.out.println("mdog = " + mdog);

        Beagle b= new Beagle("Lachs");   // costruttore specidico della childclasse

        b.eyeColor="Blaue";
        b.weight=7;
        b.bark();
        System.out.println("b = " + b);

    }
}
