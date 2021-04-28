package at.campus02.Konto;

public class GiroKonto extends Konto{
    protected  double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }
    //public void einzahlen(double wert){};

    public double auszahlen(double wert){
        double rückwert=0;
        double altekonto=kontostand;
        if(kontostand-wert<-1000.0) {
            kontostand=-1000.0;
            rückwert=altekonto-kontostand;
        }
        else {
            kontostand-=wert;
            rückwert=wert;
            }
        return rückwert;
    }

}
