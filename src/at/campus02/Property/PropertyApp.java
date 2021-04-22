package at.campus02.Property;

public class PropertyApp {
    public static void main(String[] args) {
        Property ersteList =new Property(3,3,3,"Luisa");
        ersteList.addOwner("Lucia",1000);
        ersteList.addOwner("Jo",7000);
        ersteList.addOwner("Anton",70000);

        System.out.println("remove = " + ersteList.removeOwner("Lucia"));
    }
}
