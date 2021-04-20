package Ubungbeispiele;

import java.util.Arrays;

public class OrderApp {
    public static void main(String[] args) {
        Article article1= new Article("Teppich","1234",45.95);
        Article article2= new Article("Tisch","1235",447.00);
        Article article3= new Article("Regal","1239",299.08);

        Article article4= new Article("Sessek","39",59.11);

        Article[]  articlesArray = new Article[3];
        articlesArray[0]=article1;
        articlesArray[1]=article2;
        articlesArray[2]=article3;

        Order order1=new Order(3,3,articlesArray);

       // order1.setCapacityOrder(3);
       // order1.setArticles(articlesArray);

        System.out.println("order1 = " + order1);
        //System.out.println("get = " + order1.getCapacityOrder());

           order1.addArticle(article4);
        System.out.println("order1 dopo aggiunta articolo 4 = " + order1);

        //order1.print();
    }
}
