package Ubungbeispiele_1;

public class Article {
    String name;
    String number;
    double price;

    public Article(String name, String number, double price) {
        this.name = name;
        this.number = number;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Article{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", price=" + price +
                '}';
    }
}
