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
        Mitarbeiter d=new Mitarbeiter("bic","aic","Administration",55000);
        Mitarbeiter e=new Mitarbeiter("e","Filiph","Putzen",500);
        empList.add(a);
        empList.add(b);
        empList.add(c);
        empList.add(d);
        emp.setEmpList(empList);
        HashMap<String, Double> myMap= emp.getSalaryByDepartment();

        System.out.println("myMap = " + myMap);
        System.out.println("tot salary = " +  emp.calcTotalSalary());

        emp.addEmployee(e);
        System.out.println("emp = " + emp);
    }
}
