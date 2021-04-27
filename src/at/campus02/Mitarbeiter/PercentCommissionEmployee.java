package at.campus02.Mitarbeiter;

public class PercentCommissionEmployee extends  Mitarbeiter{

    protected double percentCommission;

    public PercentCommissionEmployee(String lastname, String firstname, String department, double baseSalary) {
        super(lastname, firstname, department, baseSalary);
    }


    public double getFullSalary(){
         return super.getFullSalary()+percentCommission*super.getFullSalary();
    }
}
