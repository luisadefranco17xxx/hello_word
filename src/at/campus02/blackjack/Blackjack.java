package at.campus02.blackjack;

import java.util.HashMap;
import java.util.Map;

public class Blackjack {
    private Map<Player,Integer> myMap;

    public Blackjack() {
         myMap=new HashMap<>() ;
    }

    public  boolean add(Player player){
        if (myMap.put(player,0)==null)  return true;
        else return false;
    }

    public boolean addCard(Player player, Integer cardValue){
        if (myMap.containsKey(player)==false)  return false;          //there isn´t
        else {
            myMap.put(player,myMap.get(player)+cardValue);
            return true;
        }

    }
    public  Integer getValue(Player player){
        return myMap.getOrDefault(player,null);
    }

    public  Player getWinner(){
        Player gewinnwer=null;
        for (Player p: myMap.keySet())
             {
               if (myMap.get(p)>myMap.getOrDefault(gewinnwer,0)  || myMap.get(p)<=21){
                   gewinnwer=p;
                   if (myMap.get(p)==myMap.get(gewinnwer)) gewinnwer=null;
               }
             }

        return gewinnwer;
    }

    @Override
    public String toString() {
        String my="\n";
        for (Player p: myMap.keySet()) {
            my=my+p.getName()+", Kartenwert: " + myMap.get(p)+"\n";
        }
        return my;
    }
}
