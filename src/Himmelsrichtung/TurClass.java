package Himmelsrichtung;

import java.util.Arrays;

public class TurClass {
    public static void main(String[] args) {
        Tur tur1=new  Tur(80.09,200.0,HimmelsrichtungEnum.OSTEN);
        Tur tur2=new  Tur(99.09,199.0,HimmelsrichtungEnum.SUEDEN);
        Tur tur3=new  Tur(78.09,189.0,HimmelsrichtungEnum.NORDEN);

        System.out.println("tur1.getRichtungTur() = " + tur1.getRichtungTur());
        System.out.println("tur1.toString() = " + tur1);
        System.out.println("tur1.toString() = " + tur2);
        Tur[] tur =new Tur[3];
        tur[0]= tur1;
        tur[1]= tur2;
        tur[2]= tur3;
        for (int a = 0; a < tur.length; a++) {
            System.out.println(tur[a]);
        }
    }
}
