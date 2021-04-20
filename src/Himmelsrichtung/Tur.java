package Himmelsrichtung;

public class Tur {
    private double breite;
    public double hohe;
    HimmelsrichtungEnum richtungTur;

    public Tur(double breite,double hohe, HimmelsrichtungEnum richtungTur){
        this.breite=breite;
        this.hohe=hohe;
        this.richtungTur=richtungTur;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHohe() {
        return hohe;
    }

    public void setHohe(double hohe) {
        this.hohe = hohe;
    }

    public HimmelsrichtungEnum getRichtungTur() {
        return richtungTur;
    }

    public void setRichtungTur(HimmelsrichtungEnum richtungTur) {
        this.richtungTur = richtungTur;
    }

    @Override
    public String toString() {
        return "Tur{" +
                "breite=" + breite +
                ", hohe=" + hohe +
                ", richtungTur=" + richtungTur +
                '}';
    }
}
