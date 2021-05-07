package Ubungbeispiele_5.Getreanke;

import java.util.Comparator;

public class MLComparator implements Comparator<Getraenk> {
    @Override
    public int compare(Getraenk o1, Getraenk o2) {
        if(o1.getMengeInMl()> o2.mengeInMl())
           return 1;
        else if (o1.getMengeInMl()< o2.mengeInMl())
           return -1;
        else return 0;
    }
}
