package Ubungbeispiele_1;

import java.util.Arrays;

public class Order {
    private int nrArticles=0;
    private int capacityOrder;
    private  Article[] articles =new Article[capacityOrder];


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
       if(nrArticles==capacityOrder)
       {
           System.out.println("Not possible: max capacity order erreicht");}
       else {
           this.articles[nrArticles]=a;
           this.nrArticles++;
       }

    }

     public int findMostExpensiveArticle(){
       double max=0;
         int maxIndex=-1;
         for (int i = 0; i < articles.length; i++) {
             if(this.articles[i].price>max) {
                 max=this.articles[i].price;
                 maxIndex=i;
             }
         }
           return maxIndex+1;
     }

     public int findMostExpensiveOrderPosition(){
         double maxOrder=0;
         int maxIndex=-1;

         for (int i = 0; i < articles.length; i++) {
             if(this.articles[i].price>maxOrder) {
                 maxOrder=this.articles[i].price*this.nrArticles;   //TODO nnon si capisce per cosa moltiplicare!!!!!
                 maxIndex=i;
             }
         }
       return maxIndex+1;
     }

    public double  sumOrder() {
       double sumOrder=0;
       for (int i = 0; i < articles.length; i++) {
           sumOrder+=this.articles[i].price;
        }
       return sumOrder;
    }

    public double  calculateTax() {
        double sumTax=0;
        for (int i = 0; i < articles.length; i++) {
            if (this.articles[i].price<20.0)  { sumTax+=this.articles[i].price*0.05;}
            else if (this.articles[i].price>=20.0)  { sumTax+=this.articles[i].price*0.2;}
        }
        return sumTax;
    }
    public double sumOrderWithTax(){
       return sumOrder()+calculateTax();
    }

    public void increaseArray (){
        Article[] newArticles =new Article[this.articles.length+1];
        for (int i = 0; i < articles.length; i++) {
            newArticles[i]=this.articles[i];
        };
        this.articles=newArticles;    //bleibt letzte platzt->  newArticles[this.articles.length] frei für nächste article
        this.capacityOrder++;
    }

    public void removeArticle(int nr){
        for (int i = 0; i < articles.length; i++) {
            if(this.articles[i].number==Integer.toString(nr)) {
                this.articles=null;
                for (int j = i; j < articles.length-1; j++) {
                    articles[i]=articles[i+1];
                }
                break;
            };
            break;
        };
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
