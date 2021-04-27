package at.campus02.Mitarbeiter;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        EmployeeManager emp=new EmployeeManager();

        ArrayList<Mitarbeiter> empList=new ArrayList<>();
        Mitarbeiter a=new Mitarbeiter("b","a","Software",12000);
        Mitarbeiter b=new Mitarbeiter("bi","ai","Software",12000);
        Mitarbeiter c=new Mitarbeiter("bic","aic","Software",12000);
        empList.add(a);
        empList.add(b);
        empList.add(c);

        emp.setEmpList(empList);
       HashMap<String, Double> myMap= emp.getSalaryByDepartment();

        System.out.println("myMap = " + myMap);
    }
}
