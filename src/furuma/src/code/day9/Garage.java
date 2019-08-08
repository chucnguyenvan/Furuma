package code.day9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Garage {
    static Scanner sc=new Scanner(System.in);
    static Set<Vehicle> garaSet = new HashSet<Vehicle>();
    public static void main(String[] args) {
        Vehicle siri =new Vehicle("honda","Sirius","43K1-64268");
        addVehicle(siri);
        Vehicle chevolet =new Vehicle("oto","chevolet","43X1-64268");
        addVehicle(chevolet);
        Vehicle viettour =new Vehicle("khach16cho","Viettour","75A1-54416");
        addVehicle(viettour);
        addVehicle(chevolet);
        Vehicle Toyota =new Vehicle("oto","Toyota","43X1-33333");
        addVehicle(Toyota);
        System.out.println("so xe vao garara trong ngay="+garaSet.size());
        displayVehicle();
    }
    public static void addVehicle(){
        Vehicle vehicle=new Vehicle();
        System.out.println("Nhap vao loai xe");
        vehicle.setLoaixe(sc.nextLine());
        System.out.println("Nhap vao ten xe");
        vehicle.setName(sc.nextLine());
        System.out.println("Nhap vao bien so xe");
        vehicle.setBienso(sc.nextLine());
        garaSet.add(vehicle);
    }
    public static void addVehicle(Vehicle v){
        garaSet.add(v);
    }
    public static void displayVehicle(){
        System.out.println("Cac e da vao bai do xe");
        for (Vehicle vehicle : garaSet) {
            System.out.println(vehicle);
        }
    }
}
