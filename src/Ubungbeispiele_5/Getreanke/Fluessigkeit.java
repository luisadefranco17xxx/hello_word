package Ubungbeispiele_5.Getreanke;

public class Fluessigkeit {
    private String Name;
    private double Menge;
    private double alkoholprozent;

    public Fluessigkeit(String name, double menge, double alkoholprozent) {
        Name = name;
        Menge = menge;
        this.alkoholprozent = alkoholprozent;
    }

    public String getName() {
        return Name;
    }

    public double getMenge() {
        return Menge;
    }

    public double getAlkoholprozent() {
        return alkoholprozent;
    }

    public void setMenge(double menge) {
        Menge = menge;
    }

    @Override
    public String toString() {
        return "Fluessigkeit{" +
                "Name='" + Name + '\'' +
                ", Menge=" + Menge +
                ", alkoholprozent=" + alkoholprozent +
                '}';
    }
}
