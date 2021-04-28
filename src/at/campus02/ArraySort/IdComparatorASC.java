package at.campus02.ArraySort;

import java.util.Comparator;

public class IdComparatorASC implements Comparator<Holiday> {   //ODER HolidayComparator
    @Override
    public int compare(Holiday o1, Holiday o2) {
//        if(o1.getDestination().compareTo(o2.getDestination())<0) return -1;
//        if(o1.getDestination().compareTo(o2.getDestination())>0) return 1;
//        return 0;

        return o1.getDestination().compareTo(o2.getDestination());
    }
}
