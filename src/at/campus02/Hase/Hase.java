package at.campus02.Hase;

public class Hase {
    protected String name;

    public Hase(String name) {
        this.name = name;
    }

    public void schlafen(){
        System.out.println("Die Hase " + name+" schläft.");
    }
    public  void hoppeln(){
        System.out.println("Die Hase " + name+" hoppt.");
    }
    public  void fressen(){
        System.out.println("Die Hase " + name+" frisst.");
    }

}
