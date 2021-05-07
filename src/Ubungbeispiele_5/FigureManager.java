package Ubungbeispiele_5;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
    public  ArrayList<Figure> myA=new ArrayList<>();

    public void add (Figure f){
        myA.add(f);
    }

    public double getMaxPerimeter() {
        double max=0;
        for (Figure f:myA
             ) {
            max=f.getPerimeter();
        }
        return max;
    }

    public double getAverageAreaSize(){
        int tot=0;
        double sum=0;
        for (Figure f:myA
        ) {
            sum+=f.getArea();
            tot++;
        }
        return sum/tot;
    }


    public HashMap<String, Double> getAreaBySizeCategories(){
        HashMap<String, Double> myM=new HashMap<>();
        double sumK=0,sumM=0,sumG=0,area=0;
        for (Figure f:myA
        ) {
            area = f.getArea();
            if (area <= 1000) {
                myM.put("Klein", myM.getOrDefault(f,0.0)+area);
            } else if (area>1000 && area <=4999) {
                myM.put("Mittle", myM.getOrDefault(f,0.0)+area);
            } else {
                myM.put("Groß", myM.getOrDefault(f,0.0)+area);
            }
       }
        return myM;
    }


}
