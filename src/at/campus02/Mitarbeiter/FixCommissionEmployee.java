package at.campus02.Mitarbeiter;

public class FixCommissionEmployee extends Mitarbeiter {
    protected double additionalCommission;

    public FixCommissionEmployee(String lastname, String firstname, String department, double baseSalary) {
        super(lastname, firstname, department, baseSalary);
    }

    public double getFullSalary(){
        return super.baseSalary+additionalCommission;
    }

}
