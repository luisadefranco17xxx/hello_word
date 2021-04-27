package at.campus02.Tiere;

import java.util.ArrayList;

public class Nature {
    protected ArrayList<Animal> myList;

    public Nature() {
        myList=new ArrayList<>();
    }


    public void addAnimal(Animal a){

        myList.add(a);
    }
    public int countColor(String color){
        int count=0;
        for (int i = 0; i < myList.size(); i++) {
            if(myList.get(i).getColor()==color)
                count++;
        }
        return count;
    }

    public ArrayList<Animal> getMyList() {
        return myList;
    }

    public void setMyList(ArrayList<Animal> myList) {
        this.myList = myList;
    }

    @Override
    public String toString() {
        return "Nature{" +
                "myList=" + myList +
                '}';
    }
}
