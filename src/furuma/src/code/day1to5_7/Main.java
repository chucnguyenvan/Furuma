package code.day1to5_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static List<Customer>customersList=new ArrayList<Customer>();
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {

        disPlayMenu();
        int choice = sc.nextInt();
        sc.nextLine();
        while (choice!=0) {
            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    displayCustomer();
                    break;
                case 3:
                    System.out.println("your choise is 3");
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

    public static void disPlayMenu() {
        System.out.println("MENU");
        System.out.println("1.Add 1 khach hang");
        System.out.println("2. Hien thi khach hang");
        System.out.println("3.Hien thi cac villa va house");
        System.out.println("0.exit");
    }
    public static void addCustomer(){
        Customer khachhang = new Customer();
        System.out.println("Nhap thong tin 1 khach hang:");
        System.out.println("Nhap ten khach hang");
        khachhang.setName(sc.nextLine());
        System.out.println("Nhap ma khach hang");
        khachhang.setMSKH(sc.nextInt());
        System.out.println("Nhap tuoi khach hang");
        khachhang.setAge(sc.nextInt());
        System.out.println("Nhap so villa khach hang muon thue");
        khachhang.setNumberVilla(sc.nextInt());
        System.out.println("Nhap so House khach hang muon thue");
        khachhang.setNumberhouse(sc.nextInt());
        System.out.println("Nhap so ngay khach hang o lai");
        khachhang.setDayRent(sc.nextInt());
        sc.nextLine();
       customersList.add(khachhang);
    }
    public static void displayCustomer(){
        for (int i = 0; i < customersList.size(); i++) {
            System.out.println("Khach hang:");
            System.out.println("Ten khach hang: "+customersList.get(i).getName());
            System.out.println("Ma khach hang: "+customersList.get(i).getMSKH());
            System.out.println("Tuoi khach hang: "+customersList.get(i).getAge());
            System.out.println("So ngay khach hang o lai: "+customersList.get(i).getDayRent());
            System.out.println("-----------------*********----------------");
        }
    }
}
