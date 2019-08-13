package code.day11;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Profile profile = new Profile();
        System.out.println("Menu:");
        System.out.println("1. Them ho so");
        System.out.println("2.Tim kiem ho so");
        System.out.println("0. Thoat");
        int choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    profile.addAEmployeeFile();
                    break;
                case 2:
                    profile.searchEmployeeFile();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ban nhap khac menu");
                    break;
            }
            System.out.println("Menu:");
            System.out.println("1. Them ho so");
            System.out.println("2.Tim kiem ho so");
            System.out.println("0. Thoat");
            choice = sc.nextInt();
        }

    }
}