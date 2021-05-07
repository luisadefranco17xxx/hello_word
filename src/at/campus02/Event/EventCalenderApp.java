package at.campus02.Event;

import java.util.ArrayList;

public class EventCalenderApp {
    public static void main(String[] args) {
        EventKalender myCalender=new EventKalender();
        Event event1=new Event("tutti insieme","Pinkafeld",10.0);
        Event event2=new Event("I bambini felici","Sankt Gotthard",3.0);
        Event event3=new Event("terza eta","Graz",20.0);
        Event event4=new Event("seconda eta","Graz",30.0);
        Event event5=new Event("prima eta","Graz",40.0);
        ArrayList<Event> myList=new ArrayList<>();
        myList.add(event1);
        myList.add(event2);
        myList.add(event3);
        myList.add(event4);
        myList.add(event5);
        myCalender.add(myList);
        System.out.println("myCalender.getByTitle(\"terza eta\") = " + myCalender.getByTitle("terza eta"));
        System.out.println("myCalender.getByOrt(\"Graz\") = " + myCalender.getByOrt("Graz"));
        System.out.println("myCalender = " + myCalender.getByEintrittsPreis(1.0,40.0));
        System.out.println("myCalender = " + myCalender.getMostExpensiveByOrt("Graz"));
        System.out.println("myCalender = " + myCalender.getAvgPreisByOrt("Graz"));


        System.out.println("myCalender = " + myCalender.getCountEventsByOrt());
        System.out.println("myCalender = " + myCalender.getSumPriceEventsByOrt());
    }
}
