package at.campus02.Dog;

public class Beagle extends Dog{

    public String lovedFood;

    public Beagle (String lf){
        lovedFood=lf;
    }

    public void jump(int height){
        System.out.println("Beagle jump cm = " + height);
    }

    @Override
    public String toString() {
        return "Beagle{" +
                "lovedFood='" + lovedFood + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
