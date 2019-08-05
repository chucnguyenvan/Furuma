package code;

public class House extends Accomodation {
    private boolean status = false;
    private Customer customer;

    public House() {
    }

    public House(boolean status, Customer customer) {
        this.status = status;
        this.customer = customer;
    }

    public House(String name, int price, int size, boolean status, Customer customer) {
        super(name, price, size);
        this.status = status;
        this.customer = customer;
    }

    public void disPlay() {
            super.disPlay();
            if (this.status) {
                System.out.println("Hien Trang: da thue");
                System.out.println("Ten khach hang: " + this.customer.getName());
                System.out.println("MSKH: " + this.customer.getMSKH());
            } else {
                System.out.println("Hien Trang: Con trong");
            }
        }
}

