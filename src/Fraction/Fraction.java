package Fraction;

public class Fraction {
  int numerator;
  int denominator;
  static public int count=0;

  public Fraction(int numerator,int denominator){
   this.numerator=numerator;
   this.denominator=denominator;
   count++;
  }

    public static int getCount() {
        return count;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double toDecimal(){
        return (double)this.numerator/this.denominator;
    }
    public void printM(){
        System.out.println("numerator/denominator : " + numerator+"/"+denominator);
        //System.out.println(" is numerator/denominator = " + numerator/denominator);

    }
    public Fraction multiplicate(Fraction b2){
        Fraction newFraction=new Fraction(this.numerator*b2.numerator,this.denominator*b2.denominator);

        //newFraction.numerator=this.numerator*b2.numerator ;
        //newFraction.denominator=this.denominator*b2.denominator;
        return newFraction;
    }

    public Fraction multiplicate(Fraction b2,Fraction b3){
        Fraction newFraction=new Fraction(this.numerator*b2.numerator*b3.numerator,this.denominator* b2.denominator*b3.denominator);

        //newFraction.numerator=b2.numerator*b3.numerator ;
        //newFraction.denominator=b2.denominator*b3.denominator;
        return newFraction;
    }

    public Fraction add(Fraction b2){
        Fraction newFraction=new Fraction(0,0);
        Fraction newThis=new Fraction(this.numerator*b2.denominator,this.denominator*b2.denominator);
        Fraction newB2=new Fraction(b2.numerator*this.denominator, b2.denominator*this.denominator);

        newFraction.numerator=newThis.numerator+newB2.numerator ;
        newFraction.denominator=newThis.denominator;
        return newFraction;

    }

    @Override
    public String toString() {
        return "Fraction{" +
                //"numerator=" + numerator +
                //", denominator=" + denominator +
                ", numerator/denominator=" +numerator+"/"+denominator+
                '}';
    }
}

