package at.campus02.Orchester;



public class OrchesterApp {


    public static void main(String[] args) {


    Orchester orchester=new Orchester();
    Gitarre g=new Gitarre();
    Geige geige = new Geige();
    Trompete t=new Trompete();

        System.out.println(g);
    orchester.add(g);
    orchester.add(geige);
    orchester.add(t);

        System.out.println("Stärke ganze Orchestra = " + orchester.playAll());;

    }
}
