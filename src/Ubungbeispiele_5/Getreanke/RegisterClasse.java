package Ubungbeispiele_5.Getreanke;

import Ubungbeispiele_5.Getreanke.Getraenk;

import java.util.ArrayList;
import java.util.Collections;

public class RegisterClasse  {
    private ArrayList<Getraenk> myReg;//=new ArrayList<>();

     static int verkaufteGetraenke = 0;

    public RegisterClasse(ArrayList<Getraenk> myReg) {
        this.myReg = myReg;
    }

    public static int getVerkaufteGetraenke() {
        return verkaufteGetraenke;
    }
    public void verkaufte(Getraenk g){
        myReg.add(g);
        verkaufteGetraenke++;
    }

    public void printGetraenkeSortiertNachMl(){

        Collections.sort(myReg,new MLComparator());

        for (Getraenk g:myReg) {
            System.out.println("g = " + g);
        }

    }




}
