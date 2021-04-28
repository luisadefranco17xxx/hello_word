package at.campus02.Konto;

public class JugendGiroKonto extends GiroKonto{
    protected double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;

    }
    public  void einzahlen(double wert){
        if (wert+kontostand>buchungslimit) kontostand=buchungslimit;
        else kontostand+=wert;
    }

    //public double auszahlen( double wert){}

}
