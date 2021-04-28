package at.campus02.ArraySort;

import at.campus02.Dog.Dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        double [] darr2={4,65.5,666.9999,44,5,0.0002};
        String  [] darr={"e","r"};

        //fast way to print array
        System.out.println(Arrays.toString(darr));
        //fast way to print array
        Arrays.sort(darr);
        System.out.println(Arrays.toString(darr));

        Dog[] dogs={new Dog("brown",10), new Dog("rot",2), new Dog("gelb",5), new Dog("yy",1)};
        System.out.println("dogs = " + Arrays.toString(dogs));
        Arrays.sort(dogs);
        System.out.println("dogs = " + Arrays.toString(dogs));
        // same thing for List(arrayList)
        System.out.println("fdgfdgfd");
        ArrayList<Dog> dogList=new ArrayList<>();
        dogList.add(new Dog("brown",10));
        dogList.add(new Dog("gree",2));
        dogList.add(new Dog("brown",1440));
        dogList.add(new Dog("red",120));
        System.out.println("dogList = " + dogList);
        Collections.sort(dogList);
        System.out.println("dogList nac sortire = " + dogList);   // utiliziamo collection invece di



        Holiday summerHoliday = new Holiday("Österreich", 7, 4);
        Holiday winterHoliday = new Holiday("Österreich", 2, 4);
        Holiday winterHoliday2 = new Holiday("Österreich", 2, 12);
        Holiday defaultHoliday = new Holiday("Österreich", 2, 42);
        ArrayList<Holiday> myH=new ArrayList<>();
        myH.add(summerHoliday);
        myH.add(winterHoliday);
        myH.add(winterHoliday2);
        myH.add(defaultHoliday);
        System.out.println(myH);
        Collections.sort(myH);
        System.out.println(" nach sortierung= " );
        System.out.println(myH);

    }
}
