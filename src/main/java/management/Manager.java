package management;

import staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name, String NINumber, double salary, String deptName){
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }

    public void setDeptName(String deptName){
        this.deptName = deptName;
    }
}
