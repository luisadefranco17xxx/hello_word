package at.campus02.Land;

import java.util.ArrayList;

public class Bundesstaat extends  Land{
    ArrayList<Land> laender=new ArrayList<>();

    public Bundesstaat() {
    }
    public void addLand(Land l){
        laender.add(l);
    }

    public double getBruttoSozialProdukt(){
        double sum=0;
        for (Land l:laender
             ) {
            sum+=l.bruttoSozialProdukt();
        }
        return bruttoSozialProdukt();
    }
}
