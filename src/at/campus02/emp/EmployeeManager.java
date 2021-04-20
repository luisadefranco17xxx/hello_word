package at.campus02.emp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
  private ArrayList<Employee> myListEmployee =new ArrayList<Employee>() ;


    public EmployeeManager(ArrayList<Employee> myListEmployee) {
        this.myListEmployee = myListEmployee;
    }

    public void addEmployee(Employee e){
        myListEmployee.add(e);
    }
    public Employee findByEmpNumber(int number){
        for (Employee e:myListEmployee) {
            if (e.getEmpNumber()==number)  return e;
        }
        return null;
    }

    public ArrayList<Employee> findByDepartment(String department){
        ArrayList<Employee> emplInAbteilung=new ArrayList<Employee>();
        for (Employee e:myListEmployee) {
            if (e.getDepartment()==department)   emplInAbteilung.add(e);
        }
        return emplInAbteilung;
    }

     public Employee findByMaxSalary(){
        double maxSalary=0;
        Employee emplWithMaxSalary=null;
         for (Employee e:myListEmployee) {
             if (e.getSalary()>maxSalary)  {
                 maxSalary=e.getSalary();
                 emplWithMaxSalary=e;
             };
         }
         return emplWithMaxSalary;
     }

}
