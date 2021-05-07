package at.campus02.Konto;

public class GiroKonto extends Konto{
    protected  double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }
    //public void einzahlen(double wert){};


    @Override
    public double getKontostand() {
        return super.getKontostand();
    }
//    @Override
//    public void einzahlen(double wert){
//        kontostand+=wert;
//
//    }
    public double auszahlen(double wert){
        double rückwert=0;
        double altekonto=kontostand;
        if(kontostand-wert<-limit) {
            kontostand=-limit;
            rückwert=altekonto-kontostand;
        }
        else {
            kontostand-=wert;
            rückwert=wert;
            }
        return rückwert;
    }

}
