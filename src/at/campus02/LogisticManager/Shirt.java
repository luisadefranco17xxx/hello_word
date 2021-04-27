package at.campus02.LogisticManager;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Shirt
        implements Moveable{

    public String Brand;
    public int Size;
    public String Color;

    public Shirt() {
    }

    public Shirt(String brand, int size, String color) {
        Brand = brand;
        Size = size;
        Color = color;
    }

    @Override
    public void move(String destination) {
        System.out.println("My Shirt will be moved to " +destination);

    }
}
