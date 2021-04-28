package at.campus02.Property2;

import java.util.ArrayList;

public class PropertyApp {
    public static void main(String[] args) {

        House myhouse=new House("Luisa",200,"Herrengasse",1870);
        Flat  myflat=new Flat("Luisa",50,"Rosengasse",true,3);
        RentedFlat myrentedFlat =new RentedFlat("Luisa",50,"Rosengasse",true,3,true);

        double value;
        value=myhouse.monthlyCost();
        System.out.println("myhouse.monthlyCost = " + value);
        value=myhouse.upfrontCost();
        System.out.println("myhouse.upfrontCost = " + value);


        value=myflat.monthlyCost();
        System.out.println("myflat.monthlyCost = " + value);
        value=myflat.upfrontCost();
        System.out.println("myflat.upfrontCost = " + value);

        value=myrentedFlat.monthlyCost();
        System.out.println("myrentedFlat.monthlyCost = " + value);
        value=myrentedFlat.upfrontCost();
        System.out.println("myrentedFlat.upfrontCost = " + value);

        //
        System.out.println(" =============================== " );
        ArrayList<RentAirBnB> air= new ArrayList<>();
        air.add(myhouse);
        air.add(myflat);
        air.add(myrentedFlat);  //rentedFlat
        EScooter scoot=new EScooter(25);
        air.add(scoot);
        for (RentAirBnB r: air
             ) {
            System.out.println("air = " + r.rentAirBnB(6));
        }
    }
}
