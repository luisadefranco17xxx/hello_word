import at.campus02.ArraySort.IdComparatorASC;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapAgain {
    public static void main(String[] args) {
        HashMap<String, Integer> hashi=new HashMap<>();
        hashi.put("me",1);
        hashi.put("te",0);
        hashi.put("lei",4);
        hashi.put("lui",6);
        for (String key:hashi.keySet()){
            System.out.println("key+ hashi.get(key) = " + key+ hashi.get(key));
        }
        //voglio arraylist con tutti quelli che hanno hanno riso
        ArrayList<String> myList=new ArrayList<>();
        //myList.add("g");
        //myList.add("lei");
        ArrayList<Integer> my;
        int Lachen=0;
        for (String key:hashi.keySet()){
            //hashi.get(key);
            if(hashi.get(key)!=0) myList.add(key);
            Lachen  += hashi.get(key);
        }
        System.out.println("myList = " + myList);

        System.out.println("TOT Lachen = " + Lachen);
    }
}
