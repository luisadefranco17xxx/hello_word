package Ubungbeispiele_5.Getreanke;

import java.util.ArrayList;
import java.util.Collections;

public class GetraenkeApp {
    public static void main(String[] args) {
        //ArrayList<Getraenk> myReg;
        Cocktail g1=new Cocktail("TuttoInsieme");
        Fluessigkeit f1=new Fluessigkeit("Acqua",100,0.0);
        Fluessigkeit f2=new Fluessigkeit("Vino rosso",100,8.0);
        Fluessigkeit f3=new Fluessigkeit("Coca cola",200,0.0);
        Fluessigkeit f4=new Fluessigkeit("Aperol",200,3.0);
        Fluessigkeit f5=new Fluessigkeit("Martini",100,13.0);
        ArrayList<Fluessigkeit>  myList= new ArrayList<>();
        myList.add(f1);
        myList.add(f2);
        myList.add(f3);
        myList.add(f4);
        myList.add(f5);
        g1.setList(myList);      //ho fatto cocktail

        SimplesGetraenk g2=new SimplesGetraenk("Roma");
        g2.bestandteil.setMenge(230000);
        LongDrink g3=new LongDrink("LongAbends");
        g3.bestandteil.setMenge(240);
        LongDrink g4=new LongDrink("Mond");
        g4.bestandteil.setMenge(250);
        ArrayList<Getraenk> myReg=new ArrayList<>();
        myReg.add(g1);
        myReg.add(g2);
        myReg.add(g3);
        myReg.add(g4);


        RegisterClasse myRegister=new RegisterClasse(myReg);
        myRegister.printGetraenkeSortiertNachMl();
        System.out.println(" ============================================================= ");
        Collections.sort(myReg, new MLComparator());
        myRegister.printGetraenkeSortiertNachMl();
    }
}
