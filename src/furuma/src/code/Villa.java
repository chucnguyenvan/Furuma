package code;

public class Villa extends Accomodation {
    private boolean status = false;
    private Customer customer ;

    public Villa() {
    }

    public Villa(boolean status, Customer customer) {
        this.status = status;
        this.customer = customer;
    }

    public Villa(String name, int price, int size, boolean status, Customer customer) {
        super(name, price, size);
        this.status = status;
        this.customer = customer;
    }
    public void disPlay(){
            super.disPlay();
            if(this.status){
                System.out.println("Hien Trang: da thue");
                System.out.println("Ten khach hang: "+this.customer.getName());
                System.out.println("MSKH: "+this.customer.getMSKH());
            }else{
                System.out.println("Hien Trang: Con trong");
            }
        }

}
