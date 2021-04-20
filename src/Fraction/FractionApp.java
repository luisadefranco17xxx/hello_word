package Fraction;

public class FractionApp {
    public static void main(String[] args) {
        Fraction fraction1=new Fraction(2,3);
        Fraction fraction2=new Fraction(4,6);
        Fraction fraction3=new Fraction(3,3);

        System.out.println("fraction1.numerator = " + fraction1.numerator);
        System.out.println("fraction1.denominator = " + fraction1.denominator);

        fraction1.multiplicate(fraction2).printM();
        fraction1.multiplicate(fraction2,fraction3).printM();
        fraction1.add(fraction2).printM();

        System.out.println("Fraction.getCount() = " + Fraction.getCount());
        System.out.println("fraction1.toDecimal() = " + fraction1.toDecimal());
        System.out.println("fraction2.toDecimal() = " + fraction2.toDecimal());
        System.out.println("fraction3.toDecimal() = " + fraction3.toDecimal());

        System.out.println("fraction1.toString() = " + fraction1);
        System.out.println("fraction2.toString() = " + fraction2);
        System.out.println("fraction3.toString() = " + fraction3);
    }
}
