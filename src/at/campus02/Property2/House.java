package at.campus02.Property2;

// House derives from Property
//additional attribut:
// yearBuild: the year in which th house was finished
public class House extends Property implements RentAirBnB{
    protected int yearBuilt;

    public House(String owner, double sizeInM2, String address, int yearBuilt) {
        super(owner, sizeInM2, address);
        this.yearBuilt = yearBuilt;
    }
    //For Hauses built after 2010 m2 price ist 4000
    //For Houses built between 1950 and including 2010 price ist 2000
    // for older house price is 3000
    @Override
    public double upfrontCost() {
        if (yearBuilt>2010) {
            return 4000;
        } else if (yearBuilt> 1950){
            return 2000;
        } else {
            return  3000;
        }
    }
    // for house after 2015  cost is m2/2
    // for house 1990-2010   m2*2.5
    // for house before 199ß m2*5
    @Override
    public double monthlyCost() {
        if (yearBuilt>2010) {
            return sizeInM2/2.0;
        } else if (yearBuilt> 1950){
            return sizeInM2*2.5;
        } else {
            return  sizeInM2*5.0;
        }
    }

    @Override
    public double rentAirBnB(int days) {
        return sizeInM2 * days;
    }
}
