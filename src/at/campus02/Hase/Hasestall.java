package at.campus02.Hase;

import java.util.ArrayList;

public class Hasestall {

     public   ArrayList<Hase> myHaseList=new ArrayList<>();

     public void add(Hase a){
         myHaseList.add(a);
     }

    // @Override

    public  void hoppeln(){
        for (Hase h: myHaseList) {
           h.hoppeln();
        }
    }
}
