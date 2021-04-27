package at.campus02.Mitarbeiter;

public class Mitarbeiter {

    protected  String lastname;
    protected  String firstname;
    protected  String department;
    protected  double baseSalary;

    public Mitarbeiter(String lastname, String firstname, String department, double baseSalary) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public double getFullSalary(){
        return baseSalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
