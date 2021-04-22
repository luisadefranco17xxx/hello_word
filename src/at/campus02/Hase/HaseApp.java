package at.campus02.Hase;

public class HaseApp {

    public static void main(String[] args) {
        Weihnschtshase weihnschtshase=new Weihnschtshase(" Weihnschtshase Babbo");
        Osterhase osterhase=new Osterhase("Osterhase Colomba");           //prima referenza ...istanza

        weihnschtshase.verteileGeschenke();
        weihnschtshase.hoppeln();

        osterhase.fressen();
        osterhase.hoppeln();   //   viene chiamato funtzione di Orterhsae Class
        osterhase.schlafen();
        System.out.println();
        System.out.println();

        //istanza che adesso punta su Hase (l´inderezzo)
        Hase hase =osterhase;         // seconda referenza stess oggetto   (solo un oggetto)
                                      // in realta sta puntando su Osterhase
        hase.hoppeln();    // chiamata funzione hoppeln della classa osterhase non classe Hase

        //posso accedere solo metodi Osterhase
        // se voglio nascondere Uova
        Osterhase o2=(Osterhase)  hase;        //posso fare cast al contrario perche sono partita da Osterhase       terza referenza stesso oggetto
        //terza referenza stesso oggetto
        o2.verteileGeschencke();

        Hase hase1=new Hase("hase1 no casting");
        Hase hase2=new Hase("hase2 no casting");
        Weihnschtshase hase3=  new Weihnschtshase("weihnachthase no casting");
        Osterhase hase4=new Osterhase("osterhase no casting");
        Hasestall myStall=new Hasestall();
        myStall.add(hase1);
        myStall.add(hase2);
        myStall.add(hase3);
        myStall.add(hase4);
        System.out.println();
        // up casting
        Hase hase5 =new Weihnschtshase("Weihnachthse casting");
        Hase hase6 =new Osterhase("Osterhase casting");
        myStall.add(hase5);
        myStall.add(hase6);
        System.out.println();

        myStall.hoppeln();
    }


}
