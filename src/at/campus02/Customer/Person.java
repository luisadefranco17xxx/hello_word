package at.campus02.Customer;

public class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void doSomething(){
        System.out.println("ich bin am leben");
    }
    @Override
    public String toString() {
        return "Person{\n" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
