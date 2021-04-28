package at.campus02.Konto;

public class KontoApp {
    public static void main(String[] args) {
        JugendGiroKonto myJugendGiro= new JugendGiroKonto("Markus",1000,30000);

        myJugendGiro.einzahlen(10000);
        System.out.println(" einzahlen 10_000 => kontostand " + myJugendGiro.getKontostand());
        myJugendGiro.einzahlen(10000);
        System.out.println("  einzahlen 10_000 =>  kontostand " + myJugendGiro.getKontostand());
        System.out.println("  auszahlen 10 =>  wert " +myJugendGiro.auszahlen(10));
        System.out.println("  =>  kontostand " + myJugendGiro.getKontostand());
        System.out.println("  auszahlen 30000 =>  wert " +myJugendGiro.auszahlen(30000));
        System.out.println("  =>  kontostand " + myJugendGiro.getKontostand());

        GiroKonto myGiro=myJugendGiro;
        System.out.println("  =>  kontostand " + myGiro.getKontostand());
        System.out.println("  eizahlen 30000 =>  wert " );
                myGiro.einzahlen(30000);
        System.out.println("  =>  kontostand " + myGiro.getKontostand());
        myGiro.einzahlen(30000);
        System.out.println("  =>  kontostand " + myGiro.getKontostand());   //ich habe noch den buchungslimit !!!
    }
}
