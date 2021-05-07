package at.campus02.Dog;

public class Dog implements Comparable<Dog>{
    public String eyeColor;
    public int weight;

    public Dog(){
        eyeColor="Brown";
        weight=1;
    }
    public Dog(String eC, int w){
        eyeColor=eC;
        weight=w;
    }
    public void  bark(){
        System.out.println("Bark Bark");
    };

    @Override
    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        if(this.weight < o.weight) return -1;
        if(this.weight > o.weight) return 1;
        return 0;    //supponiamo stesso peso
    }

}
