package at.campus02.LogisticManager;

import at.campus02.Orchester.Instrument;

import java.util.ArrayList;
import java.util.List;

public class LogisticManager {
    ArrayList<Moveable> myList= new ArrayList<>();

    public void add(Moveable m){
        myList.add(m);
    }
    public void moveAll(String destination){
        for (Moveable m: myList
             ) {
            m.move(destination);
        }
    }

}
