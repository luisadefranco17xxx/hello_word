package Account;

import java.util.ArrayList;

public class AccountApp {

    public static void main(String[] args) {



    Account account1=new Account("Luisa","87123","AT667");
    Account account2=new Account("Markus","87124","AT668");
    Account account3=new Account("Charon","87125","AT669");

    ArrayList<Account>   myAccountList= new ArrayList<>();

        myAccountList.add(account1);
        myAccountList.add(account2);
        myAccountList.add(account3);
        account1.add(1000.0);
        account1.deposit(100);
        account2.add(10000.0);
        account2.deposit(200);
        account3.add(30000.0);
        account3.deposit(100);

        for (Account i: myAccountList  ) {
            System.out.println("Owner = " + i.getOwner());
            System.out.println("IBAN = " + i.getIban());
            System.out.println("BIC = " + i.getBic());
            System.out.println("BALANCE = " + i.getBalance());
            System.out.println("UniqueID() = " + i.getUniqueID());

        }
    }
}
