package at.campus02.Customer;

import java.util.ArrayList;

public class Customer extends Person {
    private int customerNumber;
    private ArrayList<Address> addresses;

    public Customer(int customerNumber, String firstName, String lastname) {
        super(firstName,lastname);
        this.customerNumber = customerNumber;
        this.addresses = new ArrayList<>();
    }



   public void addAddress(Address a){
        this.addresses.add(a);
   }

    @Override
    public String toString() {
        return "Customer{\n" +
                "\t\t\tcustomerNumber=" + customerNumber +
                ", addresses=" + addresses +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
