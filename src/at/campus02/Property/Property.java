package at.campus02.Property;

import java.util.ArrayList;
import java.util.HashMap;

public class Property {
    //latitude ist breitengrad
    //longitude ist Längengrad
    private double lat,lon;
    private double sizeInm2; // grandezza della proprieta

    private ArrayList<String> owner;
    private HashMap<String,Double>  moneyOwer;

    public Property(double lat, double lon,double size,String firstOwner){
        this.lat=lat;
        this.lon=lon;

        this.owner= new ArrayList<>();  // complex data type we have to create en istnaz
        this.owner.add(firstOwner);

        this.moneyOwer=new HashMap<>();
    }

    public void addOwner(String owner, double money){
        this.owner.add(owner);
        /*if(moneyOwer.containsKey(owner)) {
            double m =moneyOwer.get(owner);
            moneyOwer.put(owner,m+money);
        } else {
            moneyOwer.put(owner,money);
        }*/
          double oldmoney = moneyOwer.getOrDefault(owner,0.0);
         moneyOwer.put(owner,money+oldmoney);
    }

    public boolean removeOwner(String o){
       Double m= moneyOwer.get(o);
       if(m==null){     // il Owner  non ha soldi
           return  owner.remove(o);   //ritorna true se il KEy era presente nella lista
       }
       if (m != 0) {
           return false;
       }
       owner.remove(o);
       moneyOwer.remove(o);
       return true;
    }
    // falls die Person mit den Namen owner gibt soll der Shulderstand um die Summestand  Erniedrigt
    // true erfolgreicht, false wenn Owner nicht gibt oder Mehr geld zuruch zahle als noch schuldig sind
    public boolean payback(String owner, double amount) {
        Double m= moneyOwer.get(owner);
        if (m!=0) {
            if (m>=amount) {
                moneyOwer.put(owner,m-amount);
                return true;
            }
        } else return false;
        return false;
    }
}
