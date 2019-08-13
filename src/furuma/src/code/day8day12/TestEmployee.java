package code.day8day12;

import java.util.*;

public class TestEmployee {
    static Map<Integer, Employee> employeeHashMap = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }

    public static void addEmployee() {
        Employee e = new Employee();
        System.out.println("Nhap nhan vien:");
        System.out.println("Nhap ma so nhan vien: ");
        e.setMsnv(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap vao ten nhan vien ");
        e.setName(sc.nextLine());
        System.out.println("Nhap vao dia chi nhan vien ");
        e.setAddress(sc.nextLine());
        System.out.println("Nhap vao tuoi nhan vien");
        e.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("nhap vao chuc vu nhan vien");
        e.setPosition(sc.nextLine());
        employeeHashMap.put(e.getMsnv(), e);
    }

    public static void displayEmployee() {
        employeeHashMap.forEach((keyChar, valueInt) -> System.out.println(valueInt));
//        Set<Map.Entry<Integer, Employee>> setEmployees = employeeHashMap.entrySet();
//        System.out.println("Danh sach nhan vien Furuma:");
//        System.out.println(setEmployees);
    }
    public static void sortEmployee() {
        Collection<Employee> values = employeeHashMap.values();
        List<Employee> listOfValues = new ArrayList<Employee>(values);
        Collections.sort(listOfValues);
        for (Employee listOfValue : listOfValues) {
            System.out.println(listOfValue);
        }

    }
    public static void disPlayMenu() {
        System.out.println("MENU");
        System.out.println("1.Add 1 Nhan vien");
        System.out.println("2. Hien thi nhan vien");
        System.out.println("3. Sap xep nhien theo hu tu tang dan");
        System.out.println("0.exit");
    }


    public static void start() {
        disPlayMenu();
        int choice = sc.nextInt();
        sc.nextLine();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployee();
                    break;
                case 3:
                    sortEmployee();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
                    break;
            }
            disPlayMenu();
            choice = sc.nextInt();
            sc.nextLine();
        }
    }
}
