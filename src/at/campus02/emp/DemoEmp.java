package at.campus02.emp;

import java.util.ArrayList;
import java.util.List;

public class DemoEmp {

    public static void main(String[] args) {
        Employee ersteEmpl= new Employee(23,"Luisa",1000.01,"HomeOffice");
        Employee zweiteEmpl= new Employee(24,"Markus",3000.01,"Direktion");


        List<Employee> myListEmployee =new ArrayList<Employee>();
        myListEmployee.add(ersteEmpl);
        myListEmployee.add(zweiteEmpl);


        //EmployeeManager myEmpManager=new EmployeeManager("");
    }
}
