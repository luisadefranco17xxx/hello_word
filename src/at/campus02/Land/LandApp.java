package at.campus02.Land;

import java.util.ArrayList;

public class LandApp {
    public static void main(String[] args) {
     Bundesland my1=new Bundesland(1000.0);
     Bundesland my2=new Bundesland(2000.0);
        ArrayList<Bundesland> myL=new ArrayList<>();

     Bundesstaat myStaat=new Bundesstaat();
     myStaat.addLand(my1);
     myStaat.addLand(my2);
     System.out.println("myStaat.getBruttoSozialProdukt() = " + myStaat.getBruttoSozialProdukt());
         }
}
