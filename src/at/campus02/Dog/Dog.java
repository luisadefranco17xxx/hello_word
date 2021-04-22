package at.campus02.Dog;

public class Dog {
    public String eyeColor;
    public int weight;

    public void  bark(){
        System.out.println("Bark Bark");
    };

    @Override
    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
