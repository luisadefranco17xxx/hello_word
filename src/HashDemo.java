import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashDemo {
    public static void main(String[] args) {
        HashSet<String> winner= new HashSet<>();
        winner.add("s");
        winner.add("f");
        winner.add("d");
        winner.add("g");
        winner.add("hh");
        winner.add("hh");

        for (String w:winner
             ) {
            System.out.println("w = " + w);
        }
        Iterator<String> it=winner.iterator();
        while (it.hasNext()){
            System.out.println("it.next() = " + it.next());
        }
        
        
        HashMap<Integer,String> zipCity= new HashMap<>();
        zipCity.put(8010,"Graz");
        zipCity.put(1010,"Wien");
        zipCity.put(9010,"Klagenfurt");

        System.out.println("zipCity.get(1010) = " + zipCity.get(1010));
        zipCity.put(1010,"Wien Innerstadt");    //valore sovrascritto
        System.out.println("zipCity.get(1010) = " + zipCity.get(1010));
        System.out.println("zipCity.containsKey(8020) = " + zipCity.containsKey(8020));

        for (Integer zip: zipCity.keySet()
             ) {
            System.out.println("zip+\" value \"+zipCity.get(zip) = " + zip+" value "+zipCity.get(zip));
        }
        zipCity.remove(1010);
        for (Integer zip: zipCity.keySet()
        ) {
            System.out.println("zip+\" value \"+zipCity.get(zip) = " + zip+" value "+zipCity.get(zip));
        }
    }
}
