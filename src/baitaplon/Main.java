package baitaplon;

public class Main {
    public static void main(String[] args) {
        Customer[] customers=new Customer[2];
        customers[0]=new Customer();
        customers[0].setStt(1);
        customers[0].setAge(25);
        customers[0].setName("Van B");
        customers[0].setDayRent(2);
        customers[0].setNumberVilla(2);
        customers[1]=new Customer(2, "Van A", 20, 1, 0,3);
        for (Customer customer : customers) {
            System.out.println(customer);
        }

        Villa[] villas=new Villa[1];
        villas[0]=new Villa();
        for (Villa villa : villas) {
            villa.disPlayVilla();
        }

    }
}
