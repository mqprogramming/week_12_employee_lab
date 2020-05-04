package staff;

public abstract class Employee {

    private String name;
    private int natInsuranceNum;
    protected double salary;

    public Employee(String name, int natInsuranceNum, double salary) {
        this.name = name;
        this.natInsuranceNum = natInsuranceNum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) this.name = name;
    }

    public int getNatInsuranceNum() {
        return natInsuranceNum;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increment) {
        if(increment > 0) this.salary += increment;
    }

    public double payBonus() {
        double result = this.salary * 0.01;
        return result;
    }
}
