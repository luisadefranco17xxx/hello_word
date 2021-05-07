package at.campus02.Konto;

public class SparKonto extends Konto {
    public SparKonto(String inhaber) {
        super(inhaber);
    }
    @Override
    public void einzahlen(double wert){
        kontostand+=wert;

    }
    @Override
    public double auszahlen(double wert){
        double rückwert=0;
        double altekonto=kontostand;
        if(kontostand-wert<-0) {
            kontostand=-0;
            rückwert=altekonto-kontostand;
        }
        else {
            kontostand-=wert;
            rückwert=wert;
        }
        return rückwert;
    }
}
