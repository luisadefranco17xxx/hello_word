package at.campus02.wasser;

import at.campus02.emp.Employee;

import java.util.ArrayList;

public class DemoWasser {
    public static void main(String[] args) {
        Wasserstand ersterWasserstand= new Wasserstand(1,"Acquedotto Romano", "Roma",0.5,0.9,32343432);
        Wasserstand ersterWasserstand2= new Wasserstand(1,"Acquedotto Romano", "Roma",0.6,0.9,32343460);

        Wasserstand zweiteWasserstand= new Wasserstand(2,"Acquedotto Pugliese", "Puglia",0.2,0.4,323434);
        Wasserstand zweiteWasserstand2= new Wasserstand(2,"Acquedotto Pugliese", "Puglia",0.1,0.4,323435);

        Wasserstand dritteWasserstand= new Wasserstand(2,"Acquedotto antico", "campania",0.1,0.4,323435);
        Wasserstand dritteWasserstand2= new Wasserstand(2,"Acquedotto antico", "campania",0.4,0.4,323439);


        WasserstandManager myWasserstandManager= new WasserstandManager();
        myWasserstandManager.add(ersterWasserstand);
        myWasserstandManager.add(ersterWasserstand2);
        myWasserstandManager.add(zweiteWasserstand);
        myWasserstandManager.add(zweiteWasserstand2);


        System.out.println("myWasserstandManager = " + myWasserstandManager);
        System.out.println(myWasserstandManager.findLastWasserstand("Acquedotto Pugliese"));
        myWasserstandManager.add(dritteWasserstand);
        myWasserstandManager.add(dritteWasserstand2);
        System.out.println(myWasserstandManager.findForAlarmierung());
        System.out.println(myWasserstandManager.calcMittlererWasserstand("Acquedotto Pugliese","Puglia"));
        System.out.println(myWasserstandManager.findByZeitpunkt(323430,323450,"Acquedotto Pugliese","Puglia"));

    }
}
