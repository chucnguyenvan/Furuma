package code.day11;


import code.day8day12.Employee;

import java.util.Scanner;
import java.util.Stack;

public class Profile {
    private Stack<EmployeeFile> employeeFiles;

    public Profile() {
    }

    public Profile(Stack<EmployeeFile> employees) {
        this.employeeFiles = employees;
    }

    public Stack<EmployeeFile> getEmployees() {
        return employeeFiles;
    }

    public void setEmployees(Stack<EmployeeFile> employees) {
        this.employeeFiles = employees;
    }
    public void addAEmployeeFile(){
        if(employeeFiles ==null){
            employeeFiles=new Stack<EmployeeFile>();
        }
        Scanner sc =new Scanner(System.in);
        EmployeeFile e =new EmployeeFile();
        System.out.println("Nhap vao ma ho so");
        e.setMshs(sc.nextInt());
        Employee nv =new Employee();
        System.out.println("Nhap vao ho so nhan vien");
        System.out.println("Nhap ma so nhan vien: ");
        nv.setMsnv(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap vao ten nhan vien ");
        nv.setName(sc.nextLine());
        System.out.println("Nhap vao dia chi nhan vien ");
        nv.setAddress(sc.nextLine());
        System.out.println("Nhap vao tuoi nhan vien");
        nv.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap vao chuc vu nhan vien");
        nv.setPosition(sc.nextLine());
        e.setEmployee(nv);
        employeeFiles.push(e);
    }
    public void searchEmployeeFile(){
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap vao Mshs ban muon tim kiem");
        int mshs=sc.nextInt();
        for (EmployeeFile employeeFile : employeeFiles) {
            if(employeeFile.getMshs()==mshs){
                System.out.println("vi tri ho so ban tim ="+employeeFiles.search(employeeFile));
                System.out.println(employeeFile);
            }
        }

    }
}
