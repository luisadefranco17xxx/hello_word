package Ubungbeispiele_5;

public class FigureApp {

    public static void main(String[] args) {
        Rectangle r=new Rectangle(2,2);
        Circle c=new Circle(1);
        Rectangle r2=new Rectangle(4,2);
        Circle c2=new Circle(10);
        Rectangle r3=new Rectangle(2000,2);
        Circle c3=new Circle(1000);
        Rectangle r4=new Rectangle(40000,2);
        Circle c4=new Circle(100000);
        FigureManager figureManager=new FigureManager();
        figureManager.add(r);
        figureManager.add(c);
        figureManager.add(r2);
        figureManager.add(c2);
        figureManager.add(r3);
        figureManager.add(c3);
        figureManager.add(r4);
        figureManager.add(c4);

        System.out.println(figureManager.getAreaBySizeCategories());
        System.out.println(        figureManager.getAverageAreaSize());
        System.out.println(       figureManager.getMaxPerimeter());

    }
}
