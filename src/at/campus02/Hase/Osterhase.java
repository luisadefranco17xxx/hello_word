package at.campus02.Hase;

public class Osterhase extends Hase{

    public Osterhase(String name) {
        super(name);
        super.hoppeln();  //chiamo classe Hase
    }
    @Override
    public void hoppeln (){
        System.out.println("Die Hase " + name+" hoppelt zu Ostern.");
    }

    public void verteileGeschencke(){
        System.out.println("verterile geschenke " + name);
    }

}
