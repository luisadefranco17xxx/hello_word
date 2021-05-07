package Ubungbeispiele_5.Getreanke;

public abstract class Getraenk implements Brennbar, Comparable<Getraenk>{


    String name;

    public Getraenk(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Getraenk{" +
                "name='" + name + '\'' +
                '}';
    }


    public abstract int getAnzahlZutaten();
    public abstract boolean beinhaltetAlkohol();
    public abstract double mengeInMl();
    public abstract void setMengeInMl(double menge);
    public abstract double getMengeInMl();

    @Override
    public boolean brennt() {
        return false;
    }

    @Override
        public int compareTo(Getraenk o) {
            if(this.mengeInMl()>o.mengeInMl()) return 1;
            else if (this.mengeInMl()<o.mengeInMl()) return -1;
            else return 0;
        }
}
