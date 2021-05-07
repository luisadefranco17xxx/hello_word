package Ubungbeispiele_5.Getreanke;

import java.util.ArrayList;

public class Cocktail extends Getraenk {
    ArrayList <Fluessigkeit> list;

    public Cocktail(String name) {
        super(name);
    }

    public void setList(ArrayList<Fluessigkeit> list) {
        this.list = list;
    }

    @Override
    public int getAnzahlZutaten() {
        return 0;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        return false;
    }

    @Override
    public double mengeInMl() {
        return getMengeInMl();
    }
    @Override
    public void setMengeInMl(double menge){
        for (int i = 0; i < list.size(); i++) {
           list.get(i).setMenge(menge);          // suppongo in proporzione 1:1:1:1:1:1:1:.....
        }
    };
    public  double getMengeInMl(){
        double tot=0;
        for (int i = 0; i < list.size(); i++) {
            tot+=list.get(i).getMenge();          // suppongo in proporzione 1:1:1:1:1:1:1:.....
        }
        return  tot;
    };


    public boolean brennt(){
        double val=0;
        for (int i = 0; i < list.size(); i++) {
            val+=list.get(i).getAlkoholprozent();          // suppongo in proporzione 1:1:1:1:1:1:1:.....
        }
        val= val / Double.valueOf(list.size()) ;

        if(val>0.3)
            return true;
        else return false;
    };

    @Override
    public String toString() {
        return "Cocktail{" +
                "list=" + list +
                '}';
    }
}
