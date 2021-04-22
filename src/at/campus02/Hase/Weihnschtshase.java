package at.campus02.Hase;

public class Weihnschtshase extends Hase{


    public Weihnschtshase(String name) {
        super(name);
    }
    public void  verteileGeschenke(){
            System.out.println("Die Hase " + name+" verteile geschenke zu Weihnacht.");
    }
    @Override
    public void hoppeln(){
        System.out.println("Die Hase " + name+" hoppt zu Weihnacht.");
    }

}
