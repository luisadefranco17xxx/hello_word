package Ubungbeispiele;

import java.util.Arrays;

public class Order {
    private int nrArticles=0;
    private int capacityOrder;
    private  Article[] articles;


   public Order(int nrArticles,int capacityOrder, Article[] articles){
       this.nrArticles=nrArticles;
       this.capacityOrder=capacityOrder;
       this.articles=articles;
   }


    public int getNrArticles() {
        return nrArticles;
    }


    public int getCapacityOrder() {
        return capacityOrder;
    }

    public void setNrArticles(int nrArticles) {
        this.nrArticles = nrArticles;
    }

    public void setArticles(Article[] articles) {
        this.articles = articles;
    }

    public void setCapacityOrder(int capacityOrder) {
        this.capacityOrder = capacityOrder;
    }


    public void print() {
        for (int i = 0; i < capacityOrder; i++) {
            System.out.println("articles number= " + articles[i].number);
            System.out.println("         name= " + articles[i].name);
            System.out.println("         price= " + articles[i].price);

        }
        System.out.println("nrArticles = " + nrArticles);
        /*return "Order{" +
                "articles=" + Arrays.toString(articles) +
                '}';*/
    }

    public void addArticle(Article a){
       Article[] newArticles =new Article[this.articles.length+1];
        for (int i = 0; i < articles.length; i++) {
            newArticles[i]=this.articles[i];
        }
        newArticles[this.articles.length]=a;
        this.articles=newArticles;
        this.capacityOrder++;
    }


    @Override
    public String toString() {
        return "Order{" +
                "nrArticles=" + nrArticles +
                ", capacityOrder=" + capacityOrder +
                ", articles=" + Arrays.toString(articles) +
                '}';
    }
}
