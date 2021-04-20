package Account;

public class Account {
    private String owner;
    private  String iban;
    private  String bic;
    private  int uniqueID=0;
    double balance;
    private static int accountID=0;

    public String getOwner() {
        return owner;
    }

    public String getIban() {
        return iban;
    }

    public String getBic() {
        return bic;
    }

    public double getBalance() {
        return balance;
    }

    public static int getAccountID() {
        return accountID;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public Account(String owner, String iban, String bic ){
        this.owner=owner;
        this.iban=iban;
        this.bic=bic;
        this.balance=0.0;
        this.uniqueID=accountID;
        accountID++;
    }
    public void add(double wert){
        balance=balance+wert;
    }
    public void deposit(double wert){
        balance=balance-wert;
    }

}
