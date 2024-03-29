package code.day11;

import code.day8day12.Employee;

public class EmployeeFile {
    private int Mshs;
    private Employee employee;

    public EmployeeFile() {
    }

    public EmployeeFile(int mshs, Employee employee) {
        Mshs = mshs;
        this.employee = employee;
    }

    public int getMshs() {
        return Mshs;
    }

    public void setMshs(int mshs) {
        Mshs = mshs;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "EmployeeFile:\n" +
                "Mshs=" + Mshs +"\n"+
                employee.toString();
    }
}
