package Ubungbeispiele_5.Getreanke;

import Ubungbeispiele_5.Getreanke.Fluessigkeit;
import Ubungbeispiele_5.Getreanke.Getraenk;

public class LongDrink extends Getraenk {
    Fluessigkeit bestandteil;
    Fluessigkeit filler;

    public LongDrink(String name) {
        super(name);
        bestandteil=new Fluessigkeit("zutaten Best",100,0.0);
        filler=new Fluessigkeit("acqua",600,0.0);
    }

    public boolean brennt(){
        double val=0;
        val=(bestandteil.getAlkoholprozent()+ filler.getAlkoholprozent())/2.0;      // suppongo in proporzione 1:1
        if(val>0.3)
            return true;
        else return false;
    };

    @Override
    public String toString() {
        return "LongDrink{" +
                "bestandteil=" + bestandteil +
                ", filler=" + filler +
                ", brennbar=" + brennt() +
                '}';
    }

    @Override
    public int getAnzahlZutaten() {
        return 2;
    }

    @Override
    public boolean beinhaltetAlkohol() {
        if (bestandteil.getAlkoholprozent()* bestandteil.getMenge()+
                filler.getAlkoholprozent()* filler.getMenge()>0.0) return true;
        return false;
    }

    @Override
    public double mengeInMl() {
        return bestandteil.getMenge()+filler.getMenge();
    }

    @Override
    public void setMengeInMl(double menge){
        bestandteil.setMenge(menge);
    };

    public double getMengeInMl(){
        return bestandteil.getMenge()+filler.getMenge();
    };
}
