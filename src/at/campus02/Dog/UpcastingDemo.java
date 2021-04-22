package at.campus02.Dog;

public class UpcastingDemo {
    public static void main(String[] args) {
        Dog d;
        Beagle b=new Beagle("spaghetti");
        b.bark();
        b.jump(3);
        b.eyeColor="blue";
        d=b;
        d.bark();   // adesso é come un cane per cui ha i metodi del cane gm,


    }
}

