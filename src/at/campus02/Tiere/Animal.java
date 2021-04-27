package at.campus02.Tiere;

public abstract class Animal {

    protected String color;
    protected int countEyes;


    public Animal(String color, int countEyes) {
        this.color = color;
        this.countEyes = countEyes;
    }

   public abstract void makeNoise();

    public abstract void walk();




    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCountEyes() {
        return countEyes;
    }

    public void setCountEyes(int countEyes) {
        this.countEyes = countEyes;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", countEyes=" + countEyes +
                '}';
    }
}

