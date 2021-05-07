package at.campus02.blackjack;

public class BlackjackApp {
    public static void main(String[] args) {
        Player player1=new Player("Kostantin",12);
        Player player2=new Player("Philip",14);
        Player player3=new Player("Gerhard",54);
        Player player4=new Player("Martin",64);
        Player player5=new Player("Anton",94);   //schon gestorben
        Blackjack myBl = new Blackjack();
        myBl.add(player1);
        myBl.add(player2);
        myBl.add(player3);
        myBl.add(player4);
        myBl.addCard(player1,1);
        myBl.addCard(player2,2);
        myBl.addCard(player3,3);
        myBl.addCard(player4,4);

        System.out.println(" " + myBl);
        myBl.getValue(player1);
        myBl.getValue(player5);
        myBl.getWinner();

    }
}
