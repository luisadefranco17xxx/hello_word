package Ubungbeispiele_5.Getreanke;

import Ubungbeispiele_5.Getreanke.Fluessigkeit;
import Ubungbeispiele_5.Getreanke.Getraenk;

public class SimplesGetraenk extends Getraenk {
    Fluessigkeit bestandteil=new Fluessigkeit("zutaten 1",0,0.0);

    public SimplesGetraenk(String name) {
        super(name);
    }

    public boolean brennt(){
        if(bestandteil.getAlkoholprozent()>0.3) return true;
        else return false;
    };


    @Override
    public int getAnzahlZutaten() {
        return 1;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        if (bestandteil.getAlkoholprozent()* bestandteil.getMenge()>0.0) return true;
        return false;
    }

    @Override
    public double mengeInMl() {
        return bestandteil.getMenge();
    }
    @Override
    public void setMengeInMl(double menge){
        bestandteil.setMenge(menge);
    }

    @Override
    public double getMengeInMl() {
        return mengeInMl();
    }

    ;

    @Override
    public String toString() {
        return "SimplesGetraenk{" +
                "bestandteil=" + bestandteil +
                '}';
    }
}
