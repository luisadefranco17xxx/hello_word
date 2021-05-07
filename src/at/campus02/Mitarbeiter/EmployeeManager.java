package at.campus02.Mitarbeiter;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {
    protected ArrayList<Mitarbeiter>  empList= new ArrayList<>();

    public void EmployeeManager(){}

    public void setEmpList(ArrayList<Mitarbeiter> empList) {
        this.empList = empList;
    }

    public void addEmployee(Mitarbeiter m) {
        empList.add(m);
    }

    public double calcTotalSalary(){
        double sum=0;
        for (int i = 0; i < empList.size(); i++) {
            sum=sum+empList.get(i).getFullSalary();
        }
        return sum;
    }

    public HashMap<String, Double> getSalaryByDepartment(){
        HashMap<String, Double> myHash=new HashMap<>();
        double gesamtGehatl=0;
        for (Mitarbeiter m: empList
             ) {

            if(myHash.get(m.getDepartment())!=null )
            gesamtGehatl=myHash.get(m.getDepartment());

            myHash.put(m.getDepartment(),gesamtGehatl+m.getFullSalary());
        }
        return myHash;
    }

    @Override
    public String toString() {
        return "EmployeeManager{" +
                "empList=" + empList +
                '}';
    }
}
