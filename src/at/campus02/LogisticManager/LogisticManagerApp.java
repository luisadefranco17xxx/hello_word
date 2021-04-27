package at.campus02.LogisticManager;

public class LogisticManagerApp {
    public static void main(String[] args) {
        Car mycar=new Car();
        Car mycar2=new Car();
        Shirt myshirt=new Shirt();
        Shirt myshirt2=new Shirt();

        LogisticManager myLog=new LogisticManager();
        myLog.add(mycar);
        myLog.add(mycar2);
        myLog.add(myshirt);
        myLog.add(myshirt2);
        myLog.moveAll("Roma");
    }
}
