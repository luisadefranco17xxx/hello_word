package at.campus02.wasser;

import at.campus02.emp.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class WasserstandManager {

    //private ArrayList<Wasserstand> myWasserstandManager = new ArrayList<Wasserstand>();
    private ArrayList<Wasserstand> myWasserstandManager=new ArrayList<>();;

    @Override
    public String toString() {
        return "WasserstandManager{" +
                "myWasserstandManager=" + myWasserstandManager +
                '}';
    }

    public WasserstandManager() {
       // myWasserstandManager =new ArrayList<>();
        this.myWasserstandManager = myWasserstandManager;
    }

    public void add(Wasserstand w){
        myWasserstandManager.add(w);
    }
    public Wasserstand findById(int id){
        for (Wasserstand e: myWasserstandManager) {
            if (e.getId()==id)  return e;
        }
        return null;
    }

    public ArrayList<Wasserstand> findAllByGewaesser(String gewaesserName){
        ArrayList<Wasserstand> nameGewaesser=new ArrayList<Wasserstand>();
        for (Wasserstand e:myWasserstandManager) {
            if (e.getGewaesserName()==gewaesserName)   nameGewaesser.add(e);
        }
        return nameGewaesser;
    }

    public Wasserstand findLastWasserstand(String gewaesserName) {
        Wasserstand myWasser=null;
        int myZeit=0;
        for (Wasserstand e: myWasserstandManager) {
            if (e.getGewaesserName()==gewaesserName)
                if (e.getZeitpunkt()>myZeit )  {
                    myZeit=e.getZeitpunkt();
                    myWasser=e;}
        }
        return myWasser;
    }

    public ArrayList<Wasserstand> findForAlarmierung(){
        ArrayList<Wasserstand> nameGewaesser=new ArrayList<Wasserstand>();
        for (Wasserstand e:myWasserstandManager) {
            if (e.getMessWert()==e.getMessWertFuerAlarmierung())   nameGewaesser.add(e);
        }
        return nameGewaesser;
    }

    public double calcMittlererWasserstand(String gewaesserName, String ort){
        double value=0;
        int count=0;

        for (Wasserstand e: myWasserstandManager) {
            if (e.getGewaesserName()==gewaesserName && e.getOrt()==ort)
                count++;
                value+=e.getMessWert();
        }
        return value/count;
    }

    public ArrayList<Wasserstand> findByZeitpunkt(int von, int bis, String
            gewaesserName, String ort){
        ArrayList<Wasserstand> nameGewaesser=new ArrayList<Wasserstand>();
        for (Wasserstand e: myWasserstandManager) {
            if (e.getGewaesserName()==gewaesserName && e.getOrt()==ort && e.getZeitpunkt()>von && e.getZeitpunkt()<bis) {
                nameGewaesser.add(e);
            }
        }
        return nameGewaesser;
    }
}

