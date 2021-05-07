package at.campus02.Event;

import java.util.ArrayList;
import java.util.HashMap;

public class EventKalender {

    private ArrayList<Event> myEventList =new ArrayList<>();

    public void add(ArrayList<Event> myListToAdd){
        for (Event e:myListToAdd
             ) {
            myEventList.add(e);
        }

    }
    public Event getByTitle(String title){
        for (Event e:myEventList
             ) {
            if (e.getTitle()==title) return e;
        }
        return null;
    }
    public ArrayList<Event> getByOrt(String ort){
        ArrayList<Event> myNewEventList=new ArrayList<>();
        for (Event e:myEventList
        ) {
            if(e.getOrt()==ort)  myNewEventList.add(e);
        }
        return myNewEventList;
    }
    public ArrayList<Event> getByEintrittsPreis(double min, double max){
        ArrayList<Event> myNewEventList=new ArrayList<>();
        for (Event e:myEventList
        ) {
            if(e.getEintrittspreis()>=min || e.getEintrittspreis()<=max)  myNewEventList.add(e);
        }
        return myNewEventList;
    }
    public Event getMostExpensiveByOrt(String ort){
        double price=0;
        Event  myEvent=null;
        for (Event e:myEventList
        ) {
            if (e.getOrt()==ort)  {
                if (e.getEintrittspreis()>price) {
                    myEvent=e;
                    price=e.getEintrittspreis();
                }
            }
        }
        return myEvent;
    }
    public double getAvgPreisByOrt(String ort) {
        double value=0.0;
        int count=0;
        for (Event e:myEventList
        ) {
            if(ort==e.getOrt()) {
                value += e.getEintrittspreis();
                count++;
            }
        }
        return value/count;
    }
   public HashMap<String, Integer> getCountEventsByOrt() {
       HashMap<String, Integer> myMap=new HashMap<>();
       for (Event e : myEventList
       ) {
           myMap.put(e.getOrt(),myMap.getOrDefault(e.getOrt(),0)+1);
       }
       return myMap;
   }

    public HashMap<String, Double> getSumPriceEventsByOrt(){
        HashMap<String, Double> myMap=new HashMap<>();
        for (Event e : myEventList
        ) {
            myMap.put(e.getOrt(),myMap.getOrDefault(e.getOrt(),0.0)+e.getEintrittspreis());
        }
        return myMap;
    }
}
