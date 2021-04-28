package at.campus02.Property2;

//Additional Attribute: kitchenIncluded
public class RentedFlat extends Flat{
    protected boolean kitchenIncluded;

    public RentedFlat(String owner, double sizeInM2, String address, boolean furnished, int flatCategory, boolean kitchenIncluded) {
        super(owner, sizeInM2, address, furnished, flatCategory);
        this.kitchenIncluded = kitchenIncluded;
    }
    //wir are no longer to implement die abstracte methode...weil in Flat ist schon implementiert
    //wir can overwrite if wir want but we don´t have to

    //For Flat category 1     3 time month rent
    //For Flat category 2     2 time month rent
    //                   3    1.5 time month rent
    @Override
    public double upfrontCost() {
        if (flatCategory==1) {
            return 3*monthlyCost();
        } else if (flatCategory==2){
            return 2*monthlyCost();
        } else {
            return  1.5*monthlyCost();
        }
    }
    //For Flat category 1      m2 *18 ; for kitche extra 70
    //For Flat category 2       m2 *10 ; for kitche extra 40
    //For Flat category 3       m2 *7 ; for kitche extra 15

    @Override
    public double monthlyCost() {
        int isKit =0;
        if(kitchenIncluded) isKit =1;
        if (flatCategory==1) {
            return sizeInM2*18 + isKit *70;
        } else if (flatCategory==2){
            return sizeInM2*10+ isKit *40;
        } else {
            return  sizeInM2*7+ isKit *15;
        }
    }


    @Override
    public double rentAirBnB(int days) {
        return 0;        // no npuo essere affitttato come BnB
    }
}
