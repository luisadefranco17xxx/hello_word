package at.campus02.Orchester;



public class OrchesterApp {


    public static void main(String[] args) {


    Orchester orchester=new Orchester();
    Gitarre g=new Gitarre(3);
    Geige geige = new Geige(7);
    Trompete t=new Trompete(9);
    Floete f=new Floete(4);

    //System.out.println(g);
    //System.out.println();
    orchester.add(g);
    orchester.add(geige);
    orchester.add(t);
    orchester.add(f);

    System.out.println("Stärke ganze Orchestra = " + orchester.playAll());;

    }
}
