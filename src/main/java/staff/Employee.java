package staff;

public abstract class Employee {
    private String name;
    private final String NINumber;
    protected double salary;

    public Employee(String name, String NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNINumber() {
        return this.NINumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double extraSalary) {
        if (extraSalary > 0) { this.salary = this.salary + extraSalary;}

    }

    public void payBonus(){
        this.salary += getSalary() / 100;
    }

    public void changeName(String newName){
        if(newName != null) this.name = newName;
    }
}
