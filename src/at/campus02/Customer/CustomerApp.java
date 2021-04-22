package at.campus02.Customer;

public class CustomerApp {
    public static void main(String[] args) {
        Customer ersteCustomer=new Customer(1,"Markus","von Lucio");
        ersteCustomer.firstName="Johannes";
        ersteCustomer.lastName="Wither";

        Address ersteAddress=new Address("Bluegasse","8010","Graz","Österreich");
        Address zweiteAddress=new Address("Rosagasse","8090","Judenburg","Österreich");

        ersteCustomer.addAddress(ersteAddress);
        ersteCustomer.addAddress(zweiteAddress);

        System.out.println("ersteAddress = " + ersteAddress);
        System.out.println("ersteCustomer = " + ersteCustomer);
        ersteCustomer.doSomething();

        Customer zweiteCustomer=new Customer(2,"pippo","familiename von pippo");

    }
}
