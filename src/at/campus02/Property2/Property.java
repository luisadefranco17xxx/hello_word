package at.campus02.Property2;

public abstract class Property {
    protected String owner;
    protected double sizeInM2;
    protected String address;

    public Property(String owner, double sizeInM2,String address){
        this.owner=owner;
        this.address= address;
        this.sizeInM2=sizeInM2;
    }
    public abstract double upfrontCost();
    public abstract double monthlyCost();

}
