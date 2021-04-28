package at.campus02.Property2;
//additional Attribute:

//quality von 1 bis 3
public class Flat extends Property implements RentAirBnB{
    protected boolean furnished;   //arredamento?
    protected int flatCategory;// quality of the flat

    public Flat(String owner, double sizeInM2, String address, boolean furnished, int flatCategory) {
        super(owner, sizeInM2, address);
        this.furnished = furnished;
        this.flatCategory = flatCategory;
    }

    //For Flat category 1      m2 price ist 3000                  furnischre+300
    //For Flat category 2       price is 2700              3 1800        furnischre+5000
    //furnischre
    // for older house price is 2800
    @Override
    public double upfrontCost() {
        int isFur =0;
        if (furnished) isFur =1;
        if (flatCategory==1) {
            return 3000+ isFur *300;
        } else if (flatCategory==2){
            return 2700+ isFur *5000;
        } else {
            return  1800+ isFur *5000;
        }
    }
    // category 1  cost is m2 *2/3
    // category 2          m2*1.5
    // category 3          m2*3.2
    @Override
    public double monthlyCost() {
        if (flatCategory==1) {
            return sizeInM2*2/3;
        } else if (flatCategory==2){
            return sizeInM2*1.5;
        } else {
            return  sizeInM2*3.2;
        }
    }
    // we want m2/2.0 for 1 day od rent
    @Override
    public double rentAirBnB(int days) {
        return sizeInM2/2.0*days;
    }
}
