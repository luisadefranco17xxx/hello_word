package at.campus02.emp;

import java.util.ArrayList;
import java.util.List;

public class DemoEmp {

    public static void main(String[] args) {
        Employee ersteEmpl= new Employee(23,"Luisa",1000.01,"HomeOffice");
        Employee zweiteEmpl= new Employee(24,"Markus",3000.01,"Direktion");


        ArrayList<Employee> myListEmployee =new ArrayList<Employee>();
        myListEmployee.add(ersteEmpl);
        myListEmployee.add(zweiteEmpl);


        EmployeeManager myEmpManager=new EmployeeManager(myListEmployee);
        Employee dritteEmpl= new Employee(21,"Julius",4000.01,"Direktion");
        myEmpManager.addEmployee(dritteEmpl);
        Employee gefundenenEmpl= myEmpManager.findByEmpNumber(23);
        System.out.println(gefundenenEmpl);

        myListEmployee= myEmpManager.findByDepartment("Direktion");
        System.out.println(myListEmployee);
        System.out.println("gefundenenEmpl = " + myEmpManager.findByMaxSalary());

    }
}
