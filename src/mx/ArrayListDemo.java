package mx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> namesForLuckyDraw =new ArrayList<String>(50);  //uso contruttore che dice grandezza


        namesForLuckyDraw.add("A");
        namesForLuckyDraw.add("Luisa");
        namesForLuckyDraw.add("Julia");
        namesForLuckyDraw.add("klaus");

        System.out.println("namesForLuckyDraw.size() = " + namesForLuckyDraw.size());
        
        //now to linkList 
        
        //the content of the arrayList ho usato costruttore mettendo dentro l´´oggetto arrayList che gia avevo
        LinkedList<String> winner =new LinkedList<>(namesForLuckyDraw);
        for (int i = 0; i < winner.size(); i++) {
            System.out.println("winner.get(i) = " + winner.get(i));//questo é lento
        }
        // better for each
        for (String w: winner) {
            System.out.println("w = " + w);
        }
        Iterator<String> it  =namesForLuckyDraw.iterator();
        while(it.hasNext()){
            String elem =it.next();
            System.out.println("elem = " + elem);
        }
        System.out.println("**** = " );
        
        //Iterator
        Iterator<String> lIt= winner.iterator();
        while(lIt.hasNext()){
            System.out.println("lIt.next() = " + lIt.next());
        }
        
    }
}
