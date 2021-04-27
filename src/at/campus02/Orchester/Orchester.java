package at.campus02.Orchester;

import at.campus02.Hase.Hase;

import java.util.ArrayList;
import java.util.Objects;

public class Orchester {

    public ArrayList<Instrument>  myOrchester=new ArrayList<>();

    /*public Orchester() {
        ArrayList<Instrument> myOrchester =new ArrayList<>();
    }*/




    /*public Orchester(ArrayList<Instrument> myOrchester) {
        this.myOrchester = myOrchester;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orchester orchester = (Orchester) o;
        return Objects.equals(myOrchester, orchester.myOrchester);
    }

    @Override
    public int hashCode() {
        return Objects.hash(myOrchester);
    }

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
