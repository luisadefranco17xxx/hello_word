package at.campus02.Orchester;

import at.campus02.Hase.Hase;

import java.util.ArrayList;

public class Orchester {

    public ArrayList<Instrument>  myOrchester=new ArrayList<>();

    /*public Orchester() {
        ArrayList<Instrument> myOrchester =new ArrayList<>();
    }*/




    /*public Orchester(ArrayList<Instrument> myOrchester) {
        this.myOrchester = myOrchester;
    }*/


    public void add(Instrument a){
        myOrchester.add(a);
    }

    public int playAll(){
       int summ=0;;
        for (Instrument i: myOrchester
             ) {
            summ+=i.play();
        }
        return summ;
    }
}
