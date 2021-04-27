package at.campus02.Tiere;

import java.util.ArrayList;

public class AnimalApp {
    public static void main(String[] args) {
        Frog quaxy=new Frog("green",2);
        //Frog quaxy2=new Frog("green",2);
        //Animal quaxyAsAnimal=new Animal("blau",2);

        Animal quaxyAsAnimal=quaxy;   //upcasting work automatics

        Frog quaxy2=(Frog) quaxyAsAnimal;   //downcasting funziona solo se scrivo (Frog)    ->cosi non funziona  Frog quaxy2= quaxyAsAnimal;

        //quaxyAsAnimal=new Lion(0,"g");   // questo chrack solo in rum

        quaxyAsAnimal.makeNoise();  //vor casting                  //polimorfistmo ....viene chiamato sempre lúltimo piu specializzato
        quaxy.makeNoise();
        quaxyAsAnimal  = quaxy;   // quaxi castet zu einem Animal mit dem Namen quaxiAsAnimal
        quaxyAsAnimal.makeNoise();
        quaxy2= (Frog) quaxyAsAnimal;     // quaxiAsAnimal castet wieder zu einem Frog
        quaxy2.makeNoise();

        Cat miau=new Cat("grau",2,"PUFFI");
        Cat miau2;//=new Cat("grau",2,"leo");
        Cat miauAsAnimal=new Cat("blau",2,"minni");

        miauAsAnimal  = miau;   // quaxi castet zu einem Animal mit dem Namen quaxiAsAnimal
        miau2= (Cat) miauAsAnimal;     // quaxiAsAnimal castet wieder zu einem Frog


        Nature myZoo=new Nature();
        myZoo.addAnimal(quaxy);
        myZoo.addAnimal(quaxy2);
        myZoo.addAnimal(quaxyAsAnimal);
        myZoo.addAnimal(miau);
        myZoo.addAnimal(miau2);
        myZoo.addAnimal(miauAsAnimal);
        System.out.println(". = " + myZoo.getMyList());

        System.out.println(myZoo.countColor("grau"));

        Fly flyable =new Bird("blu");
        Bird b= (Bird) flyable; // downcasting if we know what is behind
        b.makeNoise();//alle
        flyable.fly();
        Fly fly2=givemesomethingThatCanFly();
        fly2.fly();

        ArrayList<Fly> allThigsinthesky =new ArrayList<>();
        allThigsinthesky.add(flyable);
        allThigsinthesky.add(fly2);

        for (Fly f:allThigsinthesky
             ) {
            f.fly();
        }
    }
    public static Fly givemesomethingThatCanFly(){
        return new Bird("green");
    }
}
