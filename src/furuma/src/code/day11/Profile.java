package code.day11;

import java.util.Scanner;
import java.util.Stack;

public class Profile {
    private Stack<EmployeeFile> employees;

    public Profile() {
    }

    public Profile(Stack<EmployeeFile> employees) {
        this.employees = employees;
    }

    public Stack<EmployeeFile> getEmployees() {
        return employees;
    }

    public void setEmployees(Stack<EmployeeFile> employees) {
        this.employees = employees;
    }
    public void addAEmployeeFile(){
        Scanner sc =new Scanner(System.in);
        EmployeeFile e =new EmployeeFile();

    }
}
