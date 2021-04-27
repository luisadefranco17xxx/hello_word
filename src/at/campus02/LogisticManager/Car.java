package at.campus02.LogisticManager;

public class Car
        implements Moveable{
    public String Type;
    public String Color;
    public int Weight;

    public Car() {
    }

    public Car(String type, String color, int weight) {
        Type = type;
        Color = color;
        Weight = weight;
    }

    @Override
    public void move(String destination) {
        System.out.println("My car will be moved to " +destination);
    }
}
